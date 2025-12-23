import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class firstTest {

    WebDriver driver;

    @BeforeAll
    public void setUp(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
    }

    @BeforeAll
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void openThePage() throws IOException {

    }

}
