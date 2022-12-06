package testng_programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginVaidationpgm_Testng {
    WebDriver driver;
    @BeforeMethod
    public void initializE()
    {
        System.setProperty("webdriver.chrome.driver", "F://chrome 96//chromedriver.exe");
        driver = new ChromeDriver();
        String url = "http://automationpractice.com/index.php";

        driver.get(url);
        driver.manage().

                window().

                maximize();
    }
    @Test
    public void login() throws InterruptedException {


        /*System.setProperty("webdriver.chrome.driver", "F://chrome 96//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "http://automationpractice.com/index.php";

        driver.get(url);
        driver.manage().

                window().

                maximize();*/
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).

                click();
        driver.findElement(By.xpath("//input[@id='email']")).

                sendKeys("automatizeanything@gmail.com");
        driver.findElement(By.xpath("//input[@id='passwd']")).

                sendKeys("Techmasters@123");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']")).

                click();

        String expTitle = "My account - My Store";
        String currentTitle = driver.getTitle();
        System.out.println(currentTitle + " is the current title");
        System.out.println(expTitle + " is the expected title");
        if (currentTitle.contentEquals(expTitle)) {
            System.out.println("test case passed");

        } else {
            System.out.println("test case failed");
        }

    }
}