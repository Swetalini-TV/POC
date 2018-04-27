package tests.userJourneys;

import assertions.ChannelAssertions;
import assertions.SearchAssertions;
import assertions.ThreadAssertions;
import helpers.ChannelHelper;
import helpers.SearchHelper;
import helpers.ThreadHelper;
import org.testng.annotations.Test;


public class UserSearchesChannelAndStoresAllThreads {

    @Test
    public void userJourney() {
        SearchHelper searchHelp = new SearchHelper();
        SearchAssertions searchAssert = new SearchAssertions();
        ChannelHelper channelHelp = new ChannelHelper();
        ChannelAssertions channelAssert = new ChannelAssertions();
        ThreadHelper threadHelp = new ThreadHelper();
        ThreadAssertions threadAssert = new ThreadAssertions();

        searchAssert.assertSearchYoutubeWithPartAndQuery(searchHelp.searchYoutubeWithPartAndQuery("snippet", "cute"));
        String channelID = searchHelp.getChannelID(searchHelp.searchYoutubeWithPartAndQueryReturnClass("snippet", "cute"));
        channelAssert.assertChannelFoundWithID(channelHelp.searchChannelWithID("snippet", channelID));
        threadAssert.assertAllThreadsFoundForChannelID(threadHelp.searchAllThreadsRelatedToAChannel("snippet", channelID));

    }

}
