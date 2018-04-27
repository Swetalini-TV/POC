package tests.smokeTests;

import assertions.SearchAssertions;
import helpers.SearchHelper;
import org.testng.annotations.Test;

public class SearchVideoNegativeFlows {

    @Test
    public void searchNegativeFlows() {
        SearchHelper searchHelp = new SearchHelper();
        SearchAssertions searchAssert = new SearchAssertions();

        searchAssert.assertSearchYoutubeWithoutAPIKey(searchHelp.searchYoutubeWithoutAPIKey());
        searchAssert.assertSearchYoutubeWithoutPart(searchHelp.searchYoutubeWithoutPart());
    }
}
