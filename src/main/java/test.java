import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String args[])
    {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String title = driver.getTitle();
        System.out.println("title of the application = " + title);
        driver.findElement(By.id("email")).sendKeys("sanjeevkmr531@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("s9949424394");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl is  = " + currentUrl);

        driver.close();
    }


}
