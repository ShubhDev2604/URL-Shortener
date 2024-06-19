import java.util.HashMap;

public class URLDatabase {
    private HashMap<String, String> urlMap;
    private HashMap<String, String> reverseUrlMap;

    public URLDatabase() {
        urlMap = new HashMap<>();
        reverseUrlMap = new HashMap<>();
    }

    public void saveUrlMapping(String longUrl, String shortUrl) {
        urlMap.put(longUrl, shortUrl);
        reverseUrlMap.put(shortUrl, longUrl);
    }

    public String getLongUrl(String shortUrl) {
        return reverseUrlMap.get(shortUrl);
    }

    public String getShortUrl(String longUrl) {
        return urlMap.get(longUrl);
    }
}
