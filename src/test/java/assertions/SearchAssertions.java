package assertions;

import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
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

    public void assertSearchYoutubeWithoutAPIKey(HttpResponseException response) {
        Assert.assertEquals(response.getStatusCode(), 400);
    }

    public void assertSearchYoutubeWithoutPart(HttpResponseException response) {
        Assert.assertEquals(response.getStatusCode(), 400);
    }
}
