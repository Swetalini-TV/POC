package clients;

import DBClient.dbReader;
import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.jackson2.JacksonFactory;
import factory.URLFactory;

import java.io.IOException;

public class BaseClient {

    private static final String API_KEY = dbReader.getKey();

    public static GenericUrl url;
    private HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    private JsonFactory JSON_FACTORY = new JacksonFactory();
    private HttpRequestFactory requestFactory =
            HTTP_TRANSPORT.createRequestFactory(new HttpRequestInitializer() {

                public void initialize(HttpRequest request) {
                    request.setParser(new JsonObjectParser(JSON_FACTORY));
                }
            });
    private HttpRequest request;

    public GenericUrl setup(URLFactory fact)
    {
        url = fact.getURL();
        return url;
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

    public HttpRequest getRequest() {
        return request;
    }

    public String getResponseAsString() {
        String res = null;
        try {
            res = request.execute().parseAsString();
        } catch (Exception e) {

        }
        return res;
    }

    public HttpResponseException getResponseException() {
        HttpResponseException res=null;
        try {
            request.execute();
        } catch (HttpResponseException e) {
            e.printStackTrace();
            return e;
        } catch (IOException e) {
        }
        return res;
    }

    public HttpResponse getResponse() {
        HttpResponse res = null;
        try {
            res = request.execute();
        } catch (Exception e) {

        }
        return res;
    }
}
