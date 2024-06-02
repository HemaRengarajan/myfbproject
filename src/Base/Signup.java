package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;



public class Signup
{

	WebDriver driver;
    WebDriverWait wait;
   
    @BeforeTest
    public void launchBrowser1()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       
        driver.get(Constantsbase.BASE_URL);
        
        driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div/div/div/div[3]/div[2]/div/div[2]/div[1]/div")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      
        // driver.findElement(By.xpath(""))
        
   }
}
