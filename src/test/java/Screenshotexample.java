import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshotexample {
    public static void main(String[] args)throws IOException {
        System.setProperty("webdriver.chrome.driver","F://chrome 96//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com//AutomationPractice/");
        TakesScreenshot ts=(TakesScreenshot) driver;
        File sourc=ts.getScreenshotAs(OutputType.FILE);
        String path=System.getProperty("user.dir")+"/screenshots/"+System.currentTimeMillis()+".jpg";
        File destination=new File(path);
        FileUtils.copyFile(sourc,destination);
       // return path;



    }
}
