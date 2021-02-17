package sg.edu.iss.app.controller;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;

@Component
public class HttpUtils {


    private PoolingHttpClientConnectionManager cm;

    public HttpUtils() {
        this.cm = new PoolingHttpClientConnectionManager();
        this.cm.setMaxTotal(100);
        this.cm.setDefaultMaxPerRoute(10);

    }

    public String doGetHtml(String url) {
        CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(cm).build();


        HttpGet httpGet = new HttpGet(url);
        httpGet.setHeader("User-Agent","Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");

        httpGet.setConfig(this.getConfig());

        CloseableHttpResponse response = null;
        try {

            response = httpClient.execute(httpGet);

            if (response.getStatusLine().getStatusCode() == 200) {
                String html = "";


                if (response.getEntity() != null) {
                    html = EntityUtils.toString(response.getEntity(), "UTF-8");
                }

                return html;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (response != null) {

                    response.close();
                }


            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;

    }



    private RequestConfig getConfig() {
        RequestConfig config=RequestConfig.custom()
                .setConnectTimeout(1000*10)
                .setConnectionRequestTimeout(500*10)
                .setSocketTimeout(1000*10)
                .build();
        return config;
    }
}
