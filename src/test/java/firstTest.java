import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class firstTest {

    WebDriver driver;

    @BeforeAll
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("--Before ALL--");
    }

    @BeforeEach
    public void beforeEach(){

        System.out.println("before EACH menthod");
    }

    @AfterAll
    public void tearDown(){

        System.out.println("Afer ALL menthod");
        driver.quit();
    }

    @AfterEach
    public void afterEach(){
        System.out.println("after EACH nethid");
    }

    @Test
    public void openThePage() throws IOException {
        driver.get("https://www.google.com/");
    }

    @DisplayName("USER STORY X - TEST CASE")
    @Test
    public void secondMethod() throws IOException {
        System.out.println("Second Method Run");
    }


    @ParameterizedTest(name = "Run:{index} - value:{arguments}")
    @ValueSource(ints = {1,2,3})
    @Test
    void parameterisedMethod(int theParams) throws IOException {
        System.out.println("Param Method Run" + theParams);
    }


}
