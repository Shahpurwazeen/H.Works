package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*HW2
        navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser*/
public class HWork2 {
    public static void main(String[] args) throws InterruptedException {

        //The path is chrome driver executable
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        //create an instance of the ChromeWebDriver
        WebDriver driver=new ChromeDriver();

        // Navigate to the Facebook login page
        driver.get("https://www.facebook.com/");

                driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Samanta",Keys.TAB,"Joy",Keys.TAB,"SamantaJ@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("SamantaJ@gmail.com",Keys.TAB,"MM2222",Keys.TAB,Keys.TAB,"Jun",Keys.TAB,"15",Keys.TAB,"1980");
        driver.findElement(By.xpath("//[contains(text(),'Male')]")).click();
        driver.findElement(By.name("websubmit")).sendKeys(Keys.ENTER);
        driver.findElement(By.linkText("Continue")).click();
        driver.findElement(By.xpath("//[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);

        driver.quit();

    }
}
