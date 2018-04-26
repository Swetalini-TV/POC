package clients;

import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.jackson2.JacksonFactory;
import factory.URLFactory;

import java.util.List;


public class SearchClient {

    private static final String encodedUrl = "https://www.googleapis.com/youtube/v3/search";
    private static final String API_KEY = "AIzaSyAQKRAvEcSdm64o2gjsnIG_C1-Opwq3jzY";
    public static GenericUrl url;
    URLFactory fact = new URLFactory();
    private HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    private JsonFactory JSON_FACTORY = new JacksonFactory();
    private HttpRequestFactory requestFactory =
            HTTP_TRANSPORT.createRequestFactory(new HttpRequestInitializer() {

                public void initialize(HttpRequest request) {
                    request.setParser(new JsonObjectParser(JSON_FACTORY));
                }
            });
    private HttpRequest request;
    private HttpResponse response;

    public SearchClient() {
        url = fact.getURL();
        addKeyToSearchURL();
    }

    public void addKeyToSearchURL() {
        url.put("key", API_KEY);
    }

    public void buildRequest(GenericUrl purl) {
        try {
            request = requestFactory.buildGetRequest(purl);
        } catch (Exception e) {

        }
    }

    public SearchResponse getResponseAsClass() {
        SearchResponse res = null;
        try {
            res = request.execute().parseAs(SearchResponse.class);
        } catch (Exception e) {

        }
        return res;
    }

    public HttpResponse getResponse() {
        try {
            response = request.execute();
        } catch (Exception e) {

        }
        return response;
    }

    public static class SearchUrl extends GenericUrl {

        public SearchUrl() {
            super(encodedUrl);
        }
    }

    public static class SearchResponse {
        public String kind;
        String etag;
        String nextPageToken;
        String regionCode;
        PageInfo pageInfo;
        List<Items> items;
    }

    public static class PageInfo {
        String totalResults;
        String resultsPerPage;
    }

    public static class Items {
        String kind;
        String etag;
        ID id;
        Snippet snippet;
        String channelID;
        String channelTitle;
        String liveBroadcastContent;

    }

    public static class ID {
        String kind;
        String videoId;
    }

    public static class Snippet {
        String publishedAt;
        String channelId;
        String title;
        String description;
        String channelTitle;
        String liveBroadcastContent;
    }
}
