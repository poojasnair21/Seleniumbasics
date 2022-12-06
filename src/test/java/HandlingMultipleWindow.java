import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandlingMultipleWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","F://chrome 96//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com//AutomationPractice/");
        String parentwindowid=driver.getWindowHandle();
        driver.findElement(By.xpath("//button[text()='Open Window']")).click();
        Set<String> windows=driver.getWindowHandles();
        for (String handle:windows)
        {
            if(handle.equalsIgnoreCase(parentwindowid))
            {
                driver.switchTo().window(handle);
                break;
            }
        }
        driver.get("https://www.google.com");
    }
}
