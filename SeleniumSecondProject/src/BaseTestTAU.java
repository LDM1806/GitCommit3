import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestTAU {
	
	public void setUp()
	{
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://the-internet.herokuapp.com/");
		//driver.manage().window().maximize();
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
		inputsLink.click();
		System.out.println(driver.getTitle());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseTestTAU test=new BaseTestTAU();
		test.setUp();
		
		
		
		

	}

}
