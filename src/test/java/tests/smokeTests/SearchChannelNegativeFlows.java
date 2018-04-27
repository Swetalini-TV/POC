package tests.smokeTests;

import assertions.ChannelAssertions;
import helpers.ChannelHelper;
import org.testng.annotations.Test;

public class SearchChannelNegativeFlows {

    @Test
    public void channelNegativeFlows()
    {
        ChannelHelper channelHelp = new ChannelHelper();
        ChannelAssertions channelAssert = new ChannelAssertions();
        channelAssert.assertSearchChannelWithoutID(channelHelp.searchChannelWithoutID("snippet"));
        channelAssert.assertSearchChannelWithoutIDAndPart(channelHelp.searchChannelWithoutIDAndPart());
        channelAssert.assertSearchChannelWithoutKey(channelHelp.searchChannelWithoutKey("UCNJcSUSzUeFm8W9P7UUlSeQ"));
    }
}
