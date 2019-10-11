package Cucumber.CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Register_StepDef {
	
	WebDriver driver;
	@Given("^open browser and sign up in testMe App$")
	public void open_browser_and_sign_up_in_testMe_App() throws Throwable 
	{
	  driver=UtilityClass.startBrowser("Chrome","http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	  
	}

	@When("^enter user name to register as \"([^\"]*)\"$")
	public void enter_user_name_to_register_as(String arg1) throws Throwable 
	{
	    driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^user enter first name in registration page as \"([^\"]*)\"$")
	public void user_enter_first_name_in_registration_page_as(String arg1) throws Throwable 
	{
	    driver.findElement(By.name("firstName")).sendKeys(arg1);
	}

	@When("^user enter last name as \"([^\"]*)\"$")
	public void user_enter_last_name_as(String arg1) throws Throwable 
	{
		driver.findElement(By.name("lastName")).sendKeys(arg1);
	}

	@When("^user enter password as \"([^\"]*)\"$")
	public void user_enter_password_as(String arg1) throws Throwable 
	{
		driver.findElement(By.name("password")).sendKeys(arg1);
	}

	@When("^user re enters the password as \"([^\"]*)\"$")
	public void user_re_enters_the_password_as(String arg1) throws Throwable 
	{
		driver.findElement(By.name("confirmPassword")).sendKeys(arg1);
	}

	@When("^user selects the gender$")
	public void user_selects_the_gender() throws Throwable 
	{
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/input[2]")).click();
	}
		
	

	@When("^user enter the email id as \"([^\"]*)\"$")
	public void user_enter_the_email_id_as(String arg1) throws Throwable 
	{
		driver.findElement(By.name("emailAddress")).sendKeys(arg1);
	    
	}

	@When("^user enters mobile number as \"([^\"]*)\"$")
	public void user_enters_mobile_number_as(String arg1) throws Throwable 
	{
		driver.findElement(By.name("mobileNumber")).sendKeys(arg1);
	}

	@When("^user enter Date of Birth as \"([^\"]*)\"$")
	public void user_enter_Date_of_Birth_as(String arg1) throws Throwable 
	{
		driver.findElement(By.name("dob")).sendKeys(arg1);
	    
	}

	@When("^user enters home Address as \"([^\"]*)\"$")
	public void user_enters_home_Address_as(String arg1) throws Throwable 
	{
		driver.findElement(By.name("address")).sendKeys(arg1);
	    
	}

	@When("^user enter security question as \"([^\"]*)\"$")
	public void user_enter_security_question_as(String arg1) throws Throwable 
	{
		driver.findElement(By.name("securityQuestion")).sendKeys(arg1);
	}

	@When("^user enter the Answer as \"([^\"]*)\"$")
	public void user_enter_the_Answer_as(String arg1) throws Throwable {
		
		driver.findElement(By.name("answer")).sendKeys(arg1);
	}

	@Then("^check if the application login page is displayed$")
	public void check_if_the_application_login_page_is_displayed() throws Throwable 
	{
		
	    driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	    WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("userName")));
		Assert.assertEquals(driver.getTitle(), "Login");
		System.out.println("User Registered Successfully !!");
		driver.close();
	}

}
