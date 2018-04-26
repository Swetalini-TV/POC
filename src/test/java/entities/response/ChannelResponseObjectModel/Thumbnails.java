package entities.response.ChannelResponseObjectModel;

public class Thumbnails {
    private Default adefault;

    private High high;

    private Medium medium;

    public Default getDefault ()
    {
        return adefault;
    }

    public void setDefault (Default pdefault)
    {
        this.adefault = pdefault;
    }

    public High getHigh ()
    {
        return high;
    }

    public void setHigh (High high)
    {
        this.high = high;
    }

    public Medium getMedium ()
    {
        return medium;
    }

    public void setMedium (Medium medium)
    {
        this.medium = medium;
    }

}
