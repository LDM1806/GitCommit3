import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class TextFromDropdown {
	
	public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	// Working on the third dropdown, viz, Old Style Select menu
	WebElement drpdwn = driver.findElement(By.id("oldSelectMenu"));
						
	System.out.println("Clicking on the drop down");
	Select se = new Select(drpdwn);
	List<WebElement> opt = se.getOptions();
	System.out.println("The total number of options in the dropdown is : " +opt.size());
	
	//Iterate through the list of options
	System.out.println("The dropdown values are--- ");
	for(WebElement options : opt)
	{
      System.out.println(options.getText());
	

}
	
}
	
}
