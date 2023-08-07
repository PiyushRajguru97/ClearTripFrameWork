package automationUtils;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericLib {

	
	public void selectItemFromListByText(WebElement element, String text) {
		
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	public void selectItemFromListByValues(WebElement element, String value) {
		
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	
	public void moveMouseOnElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	
	}



