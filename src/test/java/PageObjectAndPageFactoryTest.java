import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageObjectAndPageFactoryTest {
    WebDriver driver = new ChromeDriver();
    PageObjectAndPageFactoryExample po=new PageObjectAndPageFactoryExample(driver);

    @Test
    public void testPageObjAndPageFactory(){
        po.someMethod();
    }

}
