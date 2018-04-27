package tests.smokeTests;

import assertions.ChannelAssertions;
import helpers.ChannelHelper;
import org.testng.annotations.Test;

public class SearchChannelPositiveFlows {

    @Test
    public void searchChannelPositiveFlows()
    {
        ChannelHelper channelHelp = new ChannelHelper();
        ChannelAssertions channelAssert = new ChannelAssertions();
        channelAssert.assertChannelFoundWithID(channelHelp.searchChannelWithID("snippet","" ));
    }
}
