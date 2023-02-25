package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*HW1:
        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser*/
public class HWok1 {
    public static void main(String[] args) {

        //The path is chrome driver executable
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        //create an instance of the ChromeWebDriver
        WebDriver driver=new ChromeDriver();

        // Navigate to the registration page
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        // Find the input fields and fill in the required information
        WebElement firstName = driver.findElement(By.name("customer.firstName"));
        firstName.sendKeys("Shahpur");

        WebElement lastName = driver.findElement(By.name("customer.lastName"));
        lastName.sendKeys("Wazeen");

        WebElement address = driver.findElement(By.name("customer.address.street"));
        address.sendKeys("4532 Main St");

        WebElement city = driver.findElement(By.name("customer.address.city"));
        city.sendKeys("Arizona");

        WebElement state = driver.findElement(By.name("customer.address.state"));
        state.sendKeys("AZ");

        WebElement zipCode = driver.findElement(By.name("customer.address.zipCode"));
        zipCode.sendKeys("85253");

        WebElement phoneNumber = driver.findElement(By.name("customer.phoneNumber"));
        phoneNumber.sendKeys("354-2-3-3232");

        WebElement ssn = driver.findElement(By.name("customer.ssn"));
        ssn.sendKeys("93847646363");

        WebElement username = driver.findElement(By.name("customer.username"));
        username.sendKeys("Shahpurwazeen");

        WebElement password = driver.findElement(By.name("customer.password"));
        password.sendKeys("password");

        WebElement confirmPassword = driver.findElement(By.name("repeatedPassword"));
        confirmPassword.sendKeys("password");

        // Click on the Register button
        WebElement registerButton = driver.findElement(By.xpath("//input[@value='Register']"));
        registerButton.click();

        // Close the browser
        driver.quit();
    }
}
