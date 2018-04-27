package helpers;

import clients.SearchClient;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import entities.response.SearchResponseObjectModel.SearchResponse;
import org.json.JSONObject;


public class SearchHelper {


    SearchClient client;

    public SearchHelper() {
        client = new SearchClient();
    }

    public HttpResponse searchYoutubeWithPart(String part) {
        client.url.put("part", part);
        client.buildRequest(client.url);
        return client.getResponse();
    }

    public HttpResponse searchYoutubeWithPartAndType(String part, String type) {
        client.url.put("part", part);
        client.url.put("type", type);
        client.buildRequest(client.url);
        return client.getResponse();
    }

    public HttpResponse searchYoutubeWithPartAndQuery(String part, String Query) {
        client.url.put("part", part);
        client.url.put("q", Query);
        client.buildRequest(client.url);
        return client.getResponse();
    }

    public String searchYoutubeWithPartAndQueryReturnString(String part, String Query) {
        client.url.put("part", part);
        client.url.put("q", Query);
        client.buildRequest(client.url);
        return client.getResponseAsString();
    }

    public SearchResponse searchYoutubeWithPartAndQueryReturnClass(String part, String Query) {
        client.url.put("part", part);
        client.url.put("q", Query);
        System.out.println(client.url);
        client.buildRequest(client.url);
        SearchResponse res = client.getResponseAsClass();
        if(res==null)
        {
            System.out.println("!!!!!BLIMEY!!!!!!");
        }
        return res;
    }

    public HttpResponseException searchYoutubeWithoutAPIKey() {
        //TO DO : put code to remove API key
        client.url.set("key","garbage");
        System.out.println(client.url);
        client.buildRequest(client.url);
        return client.getResponseException();
    }

    public JSONObject parseResponse(String rawResponse) {
        JSONObject jsonObj = new JSONObject(rawResponse);
        return jsonObj;
    }

    public HttpResponseException searchYoutubeWithoutPart() {
        client.buildRequest(client.url);
        return client.getResponseException();
    }

    public String getChannelID(SearchResponse rawResponse) {
        return rawResponse.getItems()[0].getSnippet().getChannelId();
    }
}
