package tests.smokeTests;

import assertions.SearchAssertions;
import helpers.SearchHelper;
import org.testng.annotations.Test;

public class SearchVideoPositiveFlows {

    @Test
    public void searchPositiveFlows() {
        SearchHelper searchHelp = new SearchHelper();
        SearchAssertions searchAssert = new SearchAssertions();
        searchAssert.assertSearchYoutubeWithPart(searchHelp.searchYoutubeWithPart("snippet"));
        searchAssert.assertSearchYoutubeWithPartAndType(searchHelp.searchYoutubeWithPartAndType("snippet", "video"));
        searchAssert.assertSearchYoutubeWithPartAndQuery(searchHelp.searchYoutubeWithPartAndQuery("snippet", "yogawithadriene"));
    }
}
