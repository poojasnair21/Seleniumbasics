package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_login_orange {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","F://chrome 96//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensourcedemo.orangehrmlive.com/web/indec.php/auth/login");
                driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("pooja");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("pooja");


    }
}
