import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

    // All Test Pages are inheriting from this class
    public class PageObject {
        protected WebDriver driver;
        public PageObject(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
    }
