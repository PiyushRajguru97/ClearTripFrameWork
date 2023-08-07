package objectRepositary;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage  {
	   @FindBy(xpath ="//div [@class = 'p-relative']/button")
	   private WebElement TripSelectionButton;
	
		@FindBy(xpath ="//span [text()='Round trip']")
		private WebElement RoundTripOptn;
		
		@FindBy(xpath ="//span[text()='1 Adult, Economy']")
		private WebElement PersonSelectionButton;
		
		@FindBy(xpath ="//span[text()='Children']/../../ul/li[3]")
		private WebElement childrenSelectionButton;
		
		@FindBy(xpath ="//input[@placeholder ='Where from?']")
		private WebElement WhereFromTextbox;
				
		@FindBy(xpath ="//input[@placeholder ='Where to?']")
		private WebElement WhereToTextbox;
		
		@FindBy(xpath ="//ul[@class = 'airportList']")
		private List<WebElement> ResultOptns1;
		
		@FindBy(xpath ="//ul[@class = 'airportList']")
		private List<WebElement> ResultOptns2;
		
		@FindBy(xpath = "//div[@aria-label='Sun Aug 20 2023']/div/div")
		private WebElement DateTextbox;
		
		@FindBy(xpath ="//Span[text() = 'Search flights']")
		private WebElement SearchFlightButton;
		
		@FindBy(xpath ="//div [text() = '20']")
		private WebElement SelectDate;
		@FindBy(xpath ="//div [text() = '21']")
		private WebElement SelectDate2;
		@FindBy(xpath ="//div[text()='Return']")
		private WebElement ReturndateButton;
		
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	
	}
	public void ClickOnTripSelectionDD() {
		TripSelectionButton.click();
		
	}
	public void ClickOnRoundTripOption() {
		RoundTripOptn.click();
	}
	public void ClickOnPersonSelectionDD() {
		PersonSelectionButton.click();
}
	public void ClickOnAddChildrenplusButton() {
		childrenSelectionButton.click();
	}
	
	public void EnterFromLocation(String Location) {
	       WhereFromTextbox.sendKeys(Location);
	       WhereFromTextbox.click();
}
	public void ClickOnResultOptn1FromDD() {
		for(WebElement we : ResultOptns1) {
		String	AllOptns =we.getText();
		
		if(AllOptns.contains("Bangalore")) {
			we.click();
			break;
		}
		}
	}
	public void EnterToLocation(String Location) {
	       WhereToTextbox.sendKeys(Location);
	       WhereToTextbox.click();
}
	public void ClickOnResultOptn2FromDD() {
		for(WebElement we : ResultOptns1) {
		String	AllOptns =we.getText();
		
		if(AllOptns.contains("Hyderabad, IN - Rajiv Gandhi International")) {
			we.click();
			break;
		}
		}
	}
	public void ClickOnSearchFlightsButton() {
		SearchFlightButton.click();
}
	public void ClickOnDateTextBox() {
		DateTextbox.click();
}
	
	public void ClickonRequiredDate1() {
		SelectDate.click();
}
	public void ClickonReturnDate() {
		ReturndateButton.click();
}
	public void ClickonRequiredDate2() {
		SelectDate2.click();
}
	}






//Span[text() = 'Search flights']


