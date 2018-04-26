package tests.userJourneys;

import assertions.ChannelAssertions;
import assertions.SearchAssertions;
import assertions.ThreadAssertions;
import helpers.ChannelHelper;
import helpers.SearchHelper;
import helpers.ThreadHelper;
import org.junit.Test;

public class UserSearchesChannelAndStoresAllThreads {

    @Test
    public void userJourney() {
        SearchHelper searchHelp = new SearchHelper();
        SearchAssertions searchAssert = new SearchAssertions();
        ChannelHelper channelHelp = new ChannelHelper();
        ChannelAssertions channelAssert = new ChannelAssertions();
        ThreadHelper threadHelp = new ThreadHelper();
        ThreadAssertions threadAssert = new ThreadAssertions();

        searchAssert.assertSearchYoutubeWithPartAndQuery(searchHelp.searchYoutubeWithPartAndQuery("snippet", ""));
//        String Response = searchHelp.searchYoutubeWithPartAndQueryReturnString("snippet","");

//        String channelID = searchHelp.getChannelID(searchHelp.parseResponse(Response));
//        channelAssert.assertChannelFoundWithID(channelHelp.searchChannelWithID("part", channelID));


    }

}
