package factory;


import com.google.api.client.http.GenericUrl;

public class URLFactory extends GenericUrl {

    public static GenericUrl url;

    public URLFactory() {
        initialize();
    }

    private void initialize() {
        if (url == null) {
            url = new GenericUrl("https://www.googleapis.com/youtube/v3/search");
        }
    }

    public GenericUrl getURL() {
        return url;
    }

    public void destroyURL() {
        url.clear();
        url = null;
    }
}

/*
    public DriverFactory()
    {
        initialize();
    }

    public void initialize()
    {
        if(driver==null)
        {
            System.setProperty("webdriver.gecko.driver", "/Users/shwetalini/Softwares/Selenium/geckodriver");
            driver = new FirefoxDriver();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void destroyDriver()
    {
        driver.quit();
        driver=null;
    }
 */