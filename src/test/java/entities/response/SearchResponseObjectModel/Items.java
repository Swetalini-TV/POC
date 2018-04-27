package entities.response.SearchResponseObjectModel;

import com.google.api.client.util.Key;

public class Items {

    private Id id;

    private String etag;
    @Key("snippet")
    private Snippet snippet;

    private String kind;

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public Snippet getSnippet() {
        return snippet;
    }

    public void setSnippet(Snippet snippet) {
        this.snippet = snippet;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

}
