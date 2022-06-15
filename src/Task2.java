import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/amineileri/Documents/broweserDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("userName"));
        userName.click();
        userName.sendKeys("Amine");

        WebElement email = driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
        email.click();
        email.sendKeys("amineyzc@hotmail.com");
        Thread.sleep(1000);

        WebElement currentAddress = driver.findElement(new By.ByCssSelector(".form-control[placeHolder= 'Current Address']"));
        currentAddress.click();
        currentAddress.sendKeys("Arlington, VA");
        //Thread.sleep(1000);
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.click();
        permanentAddress.sendKeys("Ankara, Turkiye");
        Thread.sleep(1000);
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        WebElement nameText= driver.findElement(By.xpath("//div/p[@id='name']"));
        String text = nameText.getText();
        System.out.println(text);
        Thread.sleep(1000);
        WebElement emailText= driver.findElement(By.xpath("//div/p[@id='email']"));
        String text1 = emailText.getText();
        System.out.println(text1);
    }
}
