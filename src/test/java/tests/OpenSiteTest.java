package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.fail;

public class OpenSiteTest {

    private WebDriver driver;

    @BeforeAll
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/usr/bin");
        driver = new ChromeDriver();
    }

    @AfterAll
    public void tearDown() throws Exception {

    }

    @Test
    public void test() {
        fail("not implemented");
    }


}
