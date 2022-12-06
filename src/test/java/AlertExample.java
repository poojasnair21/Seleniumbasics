import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","F://techmasters//Seleniumbasics//chrome 96//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com//AutomationPractice/");
        Alert al=driver.switchTo().alert();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("pooja");
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
       String txtaccept= al.getText();
        System.out.println("firstalert"+txtaccept);
        al.accept();
        System.out.println("1st txt accepted");
        driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
        String txtcancel=al.getText();
        System.out.println("cancelndalert"+txtcancel);
        al.accept();
        System.out.println("canceled");


       // driver.findElement(By.xpath("//input[@id='confirmbtn']")).sendKeys("pooja");

    }
}
