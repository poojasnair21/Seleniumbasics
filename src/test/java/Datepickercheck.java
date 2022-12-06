import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Datepickercheck {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","F://techmasters//Seleniumbasics//chrome 96//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html?m=1");
        driver.findElement(By.id("datepicker")).click();;
        List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
        for(WebElement ele:allDates)
        {
            String date=ele.getText();
            if(date.equalsIgnoreCase("20"))
            {
                ele.click();
                break;
            }
        }

    }
}
