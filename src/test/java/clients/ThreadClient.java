package clients;

import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.jackson2.JacksonFactory;
import entities.response.ThreadResponseObjectModel.ThreadResponse;
import factory.URLFactory;

public class ThreadClient extends BaseClient {

    private static final String encodedUrl = "https://www.googleapis.com/youtube/v3/commentThreads";
    public static GenericUrl url;
    URLFactory fact = new URLFactory(encodedUrl);
    private HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    private JsonFactory JSON_FACTORY = new JacksonFactory();
    private HttpRequestFactory requestFactory =
            HTTP_TRANSPORT.createRequestFactory(new HttpRequestInitializer() {

                public void initialize(HttpRequest request) {
                    request.setParser(new JsonObjectParser(JSON_FACTORY));
                }
            });
    private HttpRequest request;

    public ThreadClient() {
        url = super.setup(fact);
        super.addKeyToSearchURL();
    }

    public ThreadResponse getResponseAsClass() {
        request = super.getRequest();
        ThreadResponse res = null;
        try {
            res = request.execute().parseAs(ThreadResponse.class);
        } catch (Exception e) {

        }
        return res;
    }


}
