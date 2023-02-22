package HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        // Website Amazon
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");

        //    Title
        String title=driver.getTitle();
        System.out.println(" The Title of the page is "+title);

        // URL
        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        driver.quit();

    }
}
