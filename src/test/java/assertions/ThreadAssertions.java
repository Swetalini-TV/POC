package assertions;

import com.google.api.client.http.HttpResponse;
import org.testng.Assert;

public class ThreadAssertions {

    public void assertAllThreadsFoundForChannelID(HttpResponse response)
    {
        Assert.assertEquals(200, response.getStatusCode());
    }
}
