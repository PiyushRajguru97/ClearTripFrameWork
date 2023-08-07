package objectRepositary;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightResultsPage {
	   @FindBy(xpath ="//div[contains(@class,'rt-tuple-new-container_')]")
	   private List<WebElement> FlightOptns1;
	   
	   @FindBy(xpath ="//div[@class = 'rt-tuple-new-container__details ms-grid-row-2 mt-1']")
	   private List<WebElement> FlightOptns2;
	   
	   
	   @FindBy(xpath ="//span[text()='Book now']")
	   private WebElement BooknowButton;
	   
	   
	   
	   public FlightResultsPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		
		}
	   
	   
		public void ClickOnFirstFlightOptn() {
			FlightOptns1.get(0).click();
			
		}
		public void ClickOnReturnFirstFlightOptn() {
			FlightOptns2.get(66).click();
			
		}
		public void ClickOnBookNowButton() {
			BooknowButton.click();
			
		}
		
		
}



//span[text()='Book now']