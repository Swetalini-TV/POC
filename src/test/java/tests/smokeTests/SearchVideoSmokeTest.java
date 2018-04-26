package tests.smokeTests;

import assertions.SearchAssertions;
import helpers.SearchHelper;
import org.junit.Test;

public class SearchVideoSmokeTest {

    @Test
    public void searchPositiveFlows() {
        SearchHelper searchHelp = new SearchHelper();
        SearchAssertions searchAssert = new SearchAssertions();
        searchAssert.assertSearchYoutubeWithPart(searchHelp.searchYoutubeWithPart("snippet"));
        searchAssert.assertSearchYoutubeWithPartAndType(searchHelp.searchYoutubeWithPartAndType("snippet", "video"));
        searchAssert.assertSearchYoutubeWithPartAndQuery(searchHelp.searchYoutubeWithPartAndQuery("snippet", "yogawithadriene"));
    }

    @Test
    public void searchNegativeFlows() {
        SearchHelper searchHelp = new SearchHelper();
        SearchAssertions searchAssert = new SearchAssertions();
        searchAssert.assertSearchYoutubeWithoutAPIKey(searchHelp.searchYoutubeWithoutAPIKey());
        searchAssert.assertSearchYoutubeWithPoutPart(searchHelp.searchYoutubeWithoutPart());
    }
}
