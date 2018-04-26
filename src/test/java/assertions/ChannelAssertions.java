package assertions;

import com.google.api.client.http.HttpResponse;
import org.testng.Assert;

public class ChannelAssertions {

    public void assertChannelFoundWithID(HttpResponse response)
    {
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
