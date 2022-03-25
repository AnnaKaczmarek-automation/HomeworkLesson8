import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Execution(ExecutionMode.CONCURRENT)
public class WebsiteTest extends BaseTest {

    private static Logger logger = LoggerFactory.getLogger("BaseTest.class");

    @Tag("Regression")
    @Tag("page-title")
    @ParameterizedTest()
    @EnumSource
    public void testExecution(DataStorage object) {
        driver.get(object.getUrl());
        logger.debug("<<<<<<<<<< Webside is correctly opened >>>>>>>>>>");
        String actualTitle = driver.getTitle();
        logger.info("<<<<<<<<<< Title: \""+actualTitle+"\" is correctly retrieved >>>>>>>>>>");
        assertThat("Title is not corrected", actualTitle, equalTo(object.getExpectedTitle()));
    }
}
