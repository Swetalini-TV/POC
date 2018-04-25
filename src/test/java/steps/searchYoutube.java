package steps;

import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.Key;

import java.net.URL;

public class searchYoutube {

    public static final String API_KEY = "AIzaSyAQKRAvEcSdm64o2gjsnIG_C1-Opwq3jzY";

    static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    static final JsonFactory JSON_FACTORY = new JacksonFactory();

    private static void run() throws Exception {
        HttpRequestFactory requestFactory =
                HTTP_TRANSPORT.createRequestFactory(new HttpRequestInitializer() {

                    public void initialize(HttpRequest request) {
                        request.setParser(new JsonObjectParser(JSON_FACTORY));
                    }
                });

        SearchUrl searchURL = new SearchUrl("https://www.googleapis.com/youtube/v3/search");
        searchURL.put("key", "AIzaSyAQKRAvEcSdm64o2gjsnIG_C1-Opwq3jzY");
        searchURL.put("part","snippet");
        HttpRequest request = requestFactory.buildGetRequest(searchURL);
        HttpResponse response = request.execute();
        if(response==null)
        {
            System.out.println("!!!!!!!!!!!!!!!!!!DINT GET RESPONSE!!!!!!!!!!!!!!");

        }
        else
        {
            System.out.println("*******************GOT RESPONSE*****************");
        }
    }

    public static class SearchUrl extends GenericUrl
    {

        public SearchUrl(String encodedUrl) {
            super(encodedUrl);
        }

        @Key
        private final String key = API_KEY;
    }

    public static void main(String[] args) {
        try {
            try {
                run();
                return;
            } catch (HttpResponseException e) {
                System.err.println(e.getMessage());
            }
        } catch (Throwable t) {
            t.printStackTrace();
        }
        System.exit(1);
    }
}