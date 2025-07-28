package Hashing;
import java.util.HashMap;

public class urlParser {
    public static HashMap<String, String> parseURL(String url) {
        HashMap<String, String> urlMap = new HashMap<>();

        String[] parts = url.split("\\?");

        String[] objs = parts[1].split("&");

        for (String obj : objs) {
            String[] keyValue = obj.split("=");
            if (keyValue.length == 2) {
                urlMap.put(keyValue[0], keyValue[1]);
            }
        }
        return urlMap;
    }
    public static void main(String[] args) {
        String url = "https://www.example.com/page?name=John&age=30&city=NewYork";
        HashMap<String, String> parsedUrl = parseURL(url);
        
        for (String key : parsedUrl.keySet()) {
            System.out.println(key + ": " + parsedUrl.get(key));
        }
    }
}
