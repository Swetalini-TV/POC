package assertions;

import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import org.testng.Assert;

public class ChannelAssertions {

    public void assertChannelFoundWithID(HttpResponse response) {
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    public void assertSearchChannelWithoutID(HttpResponseException response)
    {
        Assert.assertEquals(400,response.getStatusCode());
    }

    public void assertSearchChannelWithoutIDAndPart(HttpResponseException response)
    {
        Assert.assertEquals(400,response.getStatusCode());
    }

    public void assertSearchChannelWithoutKey(HttpResponseException response)
    {
        Assert.assertEquals(400,response.getStatusCode());
    }
}
