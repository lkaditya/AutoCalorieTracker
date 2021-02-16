package sg.edu.iss.app.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.azure.storage.blob.BlobClientBuilder;

@Configuration
public class AzureStorageBlobClientConfig {

	 @Value("${blob.connection-string}")
	    String connectionString;

	    @Value("${blob.container-name}")
	    String containerName;

	    @Bean
	    public BlobClientBuilder getClient() {
	        BlobClientBuilder client = new BlobClientBuilder();
	        client.connectionString(connectionString);
	        client.containerName(containerName);
//	        client.connectionString("DefaultEndpointsProtocol=https;AccountName=autocalorietrackerstore;AccountKey=cLJigCfX13K5WABkZTff72KIu64tbLJKhpc8ZsCHvgWXahm5Mln9Q39q+OoM2od8iEIzFK+58yDptJmuD08Jaw==;EndpointSuffix=core.windows.net");
//	        client.containerName("images");
	        return client;
	    }

}
