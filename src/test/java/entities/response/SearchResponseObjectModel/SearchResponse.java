package entities.response.SearchResponseObjectModel;

import com.google.api.client.util.Key;


public class SearchResponse {
    @Key("regionCode")
    private String regionCode;
    @Key("etag")
    private String etag;
    @Key("items")
    private Items[] items;
    @Key("pageInfo")
    private PageInfo pageInfo;
    @Key("nextPageToken")
    private String nextPageToken;
    @Key("kind")
    private String kind;

    public String getRegionCode ()
    {
        return regionCode;
    }

    public void setRegionCode (String regionCode)
    {
        this.regionCode = regionCode;
    }

    public String getEtag ()
    {
        return etag;
    }

    public void setEtag (String etag)
    {
        this.etag = etag;
    }

    public Items[] getItems ()
    {
        return items;
    }

    public void setItems (Items[] items)
    {
        this.items = items;
    }

    public PageInfo getPageInfo ()
    {
        return pageInfo;
    }

    public void setPageInfo (PageInfo pageInfo)
    {
        this.pageInfo = pageInfo;
    }

    public String getNextPageToken ()
    {
        return nextPageToken;
    }

    public void setNextPageToken (String nextPageToken)
    {
        this.nextPageToken = nextPageToken;
    }

    public String getKind ()
    {
        return kind;
    }

    public void setKind (String kind)
    {
        this.kind = kind;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [regionCode = "+regionCode+", etag = "+etag+", items = "+items+", pageInfo = "+pageInfo+", nextPageToken = "+nextPageToken+", kind = "+kind+"]";
    }
}
