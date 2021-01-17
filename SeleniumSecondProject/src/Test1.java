import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver ();
		driver.get("http://facebook.com");
        //driver.findElement(By.id("email")).sendKeys("This is my first code");
        //driver.findElement(By.name("pass")).sendKeys("Password");
        //driver.findElement(By.linkText("Forgotten password?")).click();
        
        driver.findElement(By.cssSelector("#email")).sendKeys("email");
        driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("pass");
        driver.findElement(By.xpath("//*[@id=\'u_0_a\']/div[3]/a")).click();


	}

}
