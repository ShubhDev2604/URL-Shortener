import java.util.HashMap;

public class URLShortener {
    private HashMap<String, String> urlMap;
    private HashMap<String, String> reverseUrlMap;
    private static final String BASE_URL = "http://short.url/";
    private HashFunction hashFunction;

    public URLShortener() {
        urlMap = new HashMap<>();
        reverseUrlMap = new HashMap<>();
        hashFunction = new HashFunction();
    }

    public String shortenURL(String longUrl) {
        if (urlMap.containsKey(longUrl)) {
            return BASE_URL + urlMap.get(longUrl);
        }
        String shortUrl = hashFunction.generateHash(longUrl);
        while (reverseUrlMap.containsKey(shortUrl)) {
            shortUrl = hashFunction.generateHash(longUrl);
        }
        urlMap.put(longUrl, shortUrl);
        reverseUrlMap.put(shortUrl, longUrl);
        return BASE_URL + shortUrl;
    }

    public String expandURL(String shortUrl) {
        String key = shortUrl.replace(BASE_URL, "");
        if (reverseUrlMap.containsKey(key)) {
            return reverseUrlMap.get(key);
        }
        return "Invalid short URL";
    }
}
