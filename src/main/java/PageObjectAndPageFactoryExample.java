import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectAndPageFactoryExample {
    WebDriver driver;

    @FindBy(xpath = "somepath")
    private WebElement someElementNAme;

    public PageObjectAndPageFactoryExample(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void someMethod(){
        System.out.println("someElementNAme.click()");
        System.out.println("someElementNAme.sendKeys(\"somevalue\")");
    }
}
