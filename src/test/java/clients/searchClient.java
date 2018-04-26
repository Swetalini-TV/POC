package clients;

import DBClient.dbReader;
import entities.response.SearchResponseObjectModel.SearchResponse;
import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.jackson2.JacksonFactory;
import factory.URLFactory;


public class SearchClient {

    private static final String encodedUrl = "https://www.googleapis.com/youtube/v3/search";
    private static final String API_KEY = dbReader.getKey();
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

    public String getResponseAsString() {
        String res = null;
        try {
            res = request.execute().parseAsString();
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

 }
