import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Shifting Content")).click();
		driver.findElement(By.linkText("Example 1: Menu Element")).click();
		List<WebElement> columns =driver.findElements(By.tagName("li"));
		System.out.println("Number of menu items " + columns.size());
		
		for (WebElement webElement : columns)
		{
		String name = webElement.getText();
		System.out.println(name);
		
		}
		
	}

}
