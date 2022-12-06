import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frameexample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","F://techmasters//Seleniumbasics//chrome 96//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://jqueryui.com/droppable/#default");
        Actions act=new Actions(driver);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']")));
        act.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")),driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();

    }
}
