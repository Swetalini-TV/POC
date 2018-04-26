package entities.response.ChannelResponseObjectModel;

public class Items {
    private String id;

    private String etag;

    private Snippet snippet;

    private String kind;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getEtag ()
    {
        return etag;
    }

    public void setEtag (String etag)
    {
        this.etag = etag;
    }

    public Snippet getSnippet ()
    {
        return snippet;
    }

    public void setSnippet (Snippet snippet)
    {
        this.snippet = snippet;
    }

    public String getKind ()
    {
        return kind;
    }

    public void setKind (String kind)
    {
        this.kind = kind;
    }
}
