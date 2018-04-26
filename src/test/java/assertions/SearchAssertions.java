package assertions;

import com.google.api.client.http.HttpResponse;
import org.testng.Assert;

public class SearchAssertions {

    public void assertSearchYoutubeWithPart(HttpResponse response) {
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    public void assertSearchYoutubeWithPartAndType(HttpResponse response) {
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    public void assertSearchYoutubeWithPartAndQuery(HttpResponse response) {
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    public void assertSearchYoutubeWithoutAPIKey(HttpResponse response) {
        Assert.assertEquals(response.getStatusCode(), 403);
    }

    public void assertSearchYoutubeWithPoutPart(HttpResponse response) {
        Assert.assertEquals(response.getStatusCode(), 400);
    }
}
