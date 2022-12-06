import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartLoginValidation {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "F://chrome 96//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url="https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D60612964962%26hvpone%3D%26hvptwo%3D%26hvadid%3D486380734074%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D1063028622971561677%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007777%26hvtargid%3Dkwd-49491430%26hydadcr%3D14454_2154375%26gclid%3DCj0KCQjwnP-ZBhDiARIsAH3FSRf-FKYc24vIo0kLRFY_NpZLHnDi3oTqYyaRjiaXsVbmbl5pWkc1DJwaAv11EALw_wcB&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//a[@id='nav-logobar-greeting']")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9847828873");
        driver.findElement(By.xpath("(//input[@id='continue'])")).click();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pooja@95");
       // driver.findElement(By.xpath("//input[@name='code']")).sendKeys("151282");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        System.out.println("test case passed");
        /* driver.findElement(By.xpath("//a[@href='/account/login?ret=/']")).click();
        driver.findElement(By.xpath("//input[@class='_2IX_2- _3umUoc _1Z69nn VJZDxU']")).sendKeys("9847828873");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3NgS1a']")).click();
        driver.findElement(By.xpath("//input[@class='_2IX_2- _1WRfas']")).click();
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3NgS1a']")).sendKeys("486264");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _14EHzR _3dESVI']")).click();
        System.out.println("Login successfully");
*/



    }
}
