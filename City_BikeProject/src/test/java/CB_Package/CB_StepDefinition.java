package CB_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CB_StepDefinition {
	
	

	WebDriver driver = new SafariDriver();
	
	 String expectedTitle = "Documentation | CityBikes API";
	 
     String actualTitle = "";

@Given("^User is already on the browser and enters correct CityBike API URL$")
public void user_is_already_on_the_browser_and_enters_correct_CityBike_API_URL() throws Throwable {
    

	driver.get("https://api.citybik.es/v2/");
	   
	   Thread.sleep(4000);
	

	
}

@When("^user confirms the API page$")
public void user_confirms_the_API_page() throws Throwable {
    
 actualTitle = driver.getTitle();
	 
     System.out.println(actualTitle);
     
     if (actualTitle.contentEquals(expectedTitle)) {
         System.out.println("Test Passed!");
     } else {
         System.out.println("Test Failed");
     }
   
	
}

@Then("^user should be able to locate the API endpoint$")
public void user_should_be_able_to_locate_the_API_endpoint() throws Throwable {
   

	driver.findElement(By.xpath("/html/body/main/pre[2]/a")).click();
	
	driver.close();
	
	
}

	
	

}
