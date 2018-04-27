package helpers;

import clients.ThreadClient;
import com.google.api.client.http.HttpResponse;
import entities.response.ThreadResponseObjectModel.ThreadResponse;

public class ThreadHelper {

    ThreadClient client;

    public ThreadHelper()
    {
        client = new ThreadClient();
    }

    public HttpResponse searchAllThreadsRelatedToAChannel(String part, String ChannelID)
    {
        client.url.put("part", part);
        client.url.put("allThreadsRelatedToChannelId", ChannelID);
        client.buildRequest(client.url);
        return client.getResponse();
    }

    public ThreadResponse searchAllThreadsRelatedToAChannelAsClass(String part, String ChannelID)
    {
        client.url.put("part", part);
        client.url.put("allThreadsRelatedToChannelId", ChannelID);
        client.buildRequest(client.url);
        return client.getResponseAsClass();
    }
}
