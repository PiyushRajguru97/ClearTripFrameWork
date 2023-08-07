package testScripts;

import org.testng.annotations.Test;

import automationUtils.BaseClass;
import objectRepositary.FlightResultsPage;
import objectRepositary.HomePage;

public class FlightBookingAutomation  extends BaseClass{
@Test
	public void ValidateFlightBooking(){
	
	HomePage Hp = new HomePage(driver) 	;
	FlightResultsPage Frp = new FlightResultsPage(driver);
	Hp.ClickOnTripSelectionDD();
	Hp.ClickOnRoundTripOption();
	Hp.ClickOnPersonSelectionDD();
	Hp.ClickOnAddChildrenplusButton();
	Hp.EnterFromLocation("Bangalore");
	Hp.ClickOnResultOptn1FromDD();
	Hp.EnterToLocation("Hyderabad");
	Hp.ClickOnResultOptn2FromDD();
	Hp.ClickOnDateTextBox();
	Hp.ClickonRequiredDate1();
	Hp.ClickonReturnDate();
	Hp.ClickonRequiredDate2();
	Hp.ClickOnSearchFlightsButton();
	Frp.ClickOnFirstFlightOptn();
	Frp.ClickOnReturnFirstFlightOptn();
	Frp.ClickOnBookNowButton();
	}
}
