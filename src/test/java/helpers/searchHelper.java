package helpers;

import clients.SearchClient;
import com.google.api.client.http.HttpResponse;
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

    public SearchClient.SearchResponse searchYoutubeWithPartAndQueryReturnString(String part, String Query) {
        client.url.put("part", part);
        client.url.put("q", Query);
        client.buildRequest(client.url);
        return client.getResponseAsClass();
    }

    public HttpResponse searchYoutubeWithoutAPIKey() {
        //TO DO : put code to remove API key
        client.url.appendRawPath("jihb");
        client.buildRequest(client.url);
        return client.getResponse();
    }

    public JSONObject parseResponse(String rawResponse) {
        JSONObject jsonObj = new JSONObject(rawResponse);
        return jsonObj;
    }

    public HttpResponse searchYoutubeWithoutPart() {
        client.buildRequest(client.url);
        return client.getResponse();
    }

    public String getChannelID(JSONObject jsonObj) {
        jsonObj.get("items");
        return "";
    }
}
