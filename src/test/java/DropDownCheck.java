import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownCheck {
     WebDriver driver;

    @BeforeMethod
    public void initilialize() {
        System.setProperty("webdriver.chrome.driver", "F://chrome 96//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com//AutomationPractice/");

    }
    @Test
public void dropdwn()
{
        Select sel=new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
        sel.selectByVisibleText("Option2");

    }
}
