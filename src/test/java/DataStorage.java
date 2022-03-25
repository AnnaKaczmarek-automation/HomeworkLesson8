public enum DataStorage {
    SII("https://siiportal.sii.pl/Poznan/SitePages/Home.aspx#/", "Sign in to your account"),
    ONET("https://www.onet.pl/", "Onet – Jesteś na bieżąco"),
    KOTUSZKOWO("http://kotuszkowo.pl/", "Kotuszkowo- blog o kotach"),
    FILMWEB("https://www.filmweb.pl/", "Filmweb - filmy takie jak Ty!"),
    SELENIUM("https://www.selenium.dev/documentation/en/webdriver/ ", "WebDriver | Selenium");


    public String expectedTitle;
    private String url;

    DataStorage(String url, String expectedTitle) {
        this.url = url;
        this.expectedTitle = expectedTitle;
    }


    public String getExpectedTitle() {
        return expectedTitle;
    }

    public String getUrl() {
        return url;
    }
}

