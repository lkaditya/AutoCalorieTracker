package sg.edu.iss.app.controller;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sg.edu.iss.app.model.FoodInfo;

import java.util.List;

@Component
public class ItemTask {

    @Autowired
    private HttpUtils httpUtils=new HttpUtils();

    private int num = 0;

    public String ItemTaskDownLoad(String url) throws Exception {
//        Document doc = Jsoup.connect(url).timeout(5000).ignoreContentType(true).ignoreHttpErrors(true).get();
        String html = httpUtils.doGetHtml(url);
//        String html = doc.toString();

        return html;
    }

    public void parse(String html, List<FoodInfo> foodInfos) throws Exception {

        Document document = Jsoup.parse(html);
        Elements elements = document.select("div.menu__items div.dish-category-section");

        for (Element element : elements) {
//            long spu = Long.parseLong(element.attr("data-spu"));
            Elements skuEle = element.select("ul.dish-list li");
            for (Element element1 : skuEle) {
                FoodInfo foodInfo = new FoodInfo();
                String src = null;
                try {
                    src = element1.select(".photo").first().attr("data-src");
                } catch (Exception e) {
                    System.out.println("");
                }
                String name = element1.select("h3.dish-name span").first().text();
                if (!(src == null)) {
                    foodInfo.setFoodImage(src);
                    foodInfo.setFoodName(name);
                    String caloriesByName = findCaloriesByName(name);
                    foodInfo.setFoodCalories(caloriesByName);
                    foodInfos.add(foodInfo);
                    num++;
                    if (num == 10) {
                        break;
                    }
                }
            }
        }
    }



    public void parseGrab(String html, List<FoodInfo> foodInfos) throws Exception {

        Document document = Jsoup.parse(html);
        Elements elements = document.select("div.menu__items div.dish-category-section");

        for (Element element : elements) {
//            long spu = Long.parseLong(element.attr("data-spu"));
            Elements skuEle = element.select("ul.dish-list li");
            for (Element element1 : skuEle) {
                FoodInfo foodInfo = new FoodInfo();
                String src = null;
                try {
                    src = element1.select(".photo").first().attr("data-src");
                } catch (Exception e) {
                    System.out.println("");
                }
                String name = element1.select("h3.dish-name span").first().text();
                if (!(src == null)) {
                    foodInfo.setFoodImage(src);
                    foodInfo.setFoodName(name);
                    String caloriesByName = findCaloriesByName(name);
                    foodInfo.setFoodCalories(caloriesByName);
                    foodInfos.add(foodInfo);
                    num++;
                    if (num == 10) {
                        break;
                    }
                }
            }
        }
    }
















    public String findCaloriesByName(String name) throws Exception {
//        String url="https://www.google.com/search?rlz=1C1CHWL_zh-CNSG917SG917&biw=1396&bih=377&sxsrf=ALeKk01Lfgsc4zFWPSdyF7da8t6SyFy2tw%3A1611900034861&ei=gqQTYJqENIvSz7sP-6yJuAg&q=" +
//                ""+name+"+calories&oq="+name+"+calories" +
//                "&gs_lcp=CgZwc3ktYWIQAzIECCMQJzIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yBggAEAcQHjIGCAAQBxAeMgYIABAHEB4yCAgAEAcQBRAeUMSixANYxKLEA2D5p8QDaABwAngAgAFYiAFYkgEBMZgBAKABAqABAaoBB2d3cy13aXrAAQE&sclient=psy-ab&ved=0ahUKEwiazfbHu8DuAhUL6XMBHXtWAocQ4dUDCA0&uact=5";
//myfitnesspal
        String url = "https://www.myfitnesspal.com/food/search?page=1&search=" + name;

//        String newUrl=url.replace(" ","+");
//myfitnesspal
        String newUrl = url.replace(" ", "%20");
        System.out.println(newUrl);
        String html = ItemTaskDownLoad(newUrl);
        Document document = Jsoup.parse(html);
        String calories = "";
        try {
//             calories = document.select("div#search div.xpdopen div.moIzSc div.Z0LcW").first().text();
            //myfitnesspal
            calories = document.select("div#app div.MFPApp-3IaDG div.root-2XVjd div.label-1frn- span").first().text();

        } catch (Exception e) {
            System.out.println(" ");
        }

        if (calories.equals("") || calories.equals("0")) {
            calories = "NOT FOUND";
        }

        return calories;
    }
}
