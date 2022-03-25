import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseTest {


    protected WebDriver driver;
    private static Logger logger = LoggerFactory.getLogger("BaseTest.class");

    @BeforeAll
    static void beforeAll() {
        WebDriverManager.chromedriver().setup();
        logger.info("<<<<<<<<<< Driver is initiated properly >>>>>>>>>>");
        logger.info("Still before all tests >>>>>>>>>>");
    }

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        logger.info("<<<<<<<<<< Window is correctly maximized >>>>>>>>>>");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
        logger.info("Driver is closed properly");
    }
}

