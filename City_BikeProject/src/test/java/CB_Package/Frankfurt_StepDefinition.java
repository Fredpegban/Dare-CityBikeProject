package CB_Package;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Frankfurt_StepDefinition {
	
	//System.setProperty("WebDriver.Chrome.Driver", "‎⁨/APPLE SSD SM0256F⁩/Users⁩/macbookpro⁩/Downloads⁩⁩");


	//WebDriver driver = new ChromeDriver();
	
	WebDriver driver = new SafariDriver();
	 String expectedTitle = "Frankfurt Germany - Google Maps";
	 
     String actualTitle = "";
	
	

@Given("^that user is already on the googlemap website$")
public void that_user_is_already_on_the_googlemap_website() throws Throwable {
    
	driver.get("https://www.google.co.uk/maps");
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	

	driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/div/div[2]/div[1]/div[4]/form/div[1]/div/button/span\n"
			+ "	")).click();
	
	
}

@When("^user search for Frankfurt in Germany$")
public void user_search_for_Frankfurt_in_Germany() throws Throwable {
   
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"searchboxinput\"] ")).sendKeys(" Frankfurt Germany ");
	
	

}

@When("^user click search icon$")
public void user_click_search_icon() throws Throwable {
	
	Thread.sleep(3000);
	//driver.findElement(By.id("searchbox-searchbutton ")).click();
	driver.findElement(By.xpath("//*[@id=\"searchbox-searchbutton\"] ")).click();

	
	
}

@Then("^user can confirm the location is in Germany$")
public void user_can_confirm_the_location_is_in_Germany() throws Throwable {
   

	 actualTitle = driver.getTitle();
	 
     System.out.println(actualTitle);
     
     if (actualTitle.contentEquals(expectedTitle)) {
         System.out.println("Frankfurt is in Germany!");
     } else {
         System.out.println("Frankfurt Not in Germany ");
     }
	
	
	
}

@Then("^user should be able to request for the latitude and longitude of Frankfurt$")
public void user_should_be_able_to_request_for_the_latitude_and_longitude_of_Frankfurt() throws Throwable {
    
	 Map< String,Object> coordinates =  new HashMap< String,Object>();
     
     /* Create a hashmap for latitude, longitude, and accuracy as needed by Google Maps */
	 
     coordinates.put("latitude", 50.1213479  ); 
     coordinates.put("longitude", -8.4964795);
     coordinates.put("accuracy", 100);

     System.out.println("API response is " + coordinates);
     
		
}
@Then("^user tear down the project$")
public void user_tear_down_the_project() throws Throwable {
    
 driver.close();
	
	
	
}




}
