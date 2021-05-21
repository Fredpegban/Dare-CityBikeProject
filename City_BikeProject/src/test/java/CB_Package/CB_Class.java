package CB_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CB_Class {
//public static void main(String[] args) throws InterruptedException {
	
	
	//System.setProperty("WebDriver.Safari.Driver", "‎⁨/APPLE SSD SM0256F⁩/Users⁩/macbookpro⁩/Downloads⁩⁩");

	WebDriver driver = new SafariDriver();
	
	 String expectedTitle = "Documentation | CityBikes API";
	 
     String actualTitle = "";
     
	
	
@Given("^User is on the browser$")
public void user_is_on_the_browser() throws Throwable {
    
	  
	   driver.get("https://api.citybik.es/v2/");
	   
	   Thread.sleep(4000);
 
         //driver.get("www.google.com");
        // driver.close();
    
    
}

@When("^user enters correct CityBike API URL$")
public void user_enters_correct_CityBike_API_URL() throws Throwable {
	 // driver.get("https://api.citybik.es/v2/");
	
	 driver.findElement(By.xpath("/html/body/main/pre[2]/a")).click();
  
}

@Then("^Confirm the API page$")
public void confirm_the_API_page() throws Throwable {
    
	
	 actualTitle = driver.getTitle();
	 
     System.out.println(actualTitle);
     
     if (actualTitle.contentEquals(expectedTitle)) {
         System.out.println("Test Passed!");
     } else {
         System.out.println("Test Failed");
     }
    
}

@Given("^that I am on the City Bike's API website$")
public void that_I_am_on_the_City_Bike_s_API_website() throws Throwable {
   
	
    
}

@When("^I enter correct City Bike API URL$")
public void i_enter_correct_City_Bike_API_URL() throws Throwable {
    

	
	
    
}

@When("^request for the latitude and longitude of Frankfurt$")
public void request_for_the_latitude_and_longitude_of_Frankfurt() throws Throwable {
   
    
    
    
}

@Then("^the response should confirm the location is in Germany$")
public void the_response_should_confirm_the_location_is_in_Germany() throws Throwable {
    
    
    
    
}


}
