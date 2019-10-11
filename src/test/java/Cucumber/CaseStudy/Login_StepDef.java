package Cucumber.CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Login_StepDef {
	WebDriver driver;
	@Given("^user not logged in$")
	public void user_not_logged_in() throws Throwable {
		driver=UtilityClass.startBrowser("Chrome","http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul/li[1]/a")).click(); 
	    
	}

	@When("^user performs login using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_performs_login_using_and(String arg1, String arg2) throws Throwable {
	    driver.findElement(By.name("userName")).sendKeys(arg1);
	    driver.findElement(By.name("password")).sendKeys(arg2);
	}

	@Then("^Logged in successfully$")
	public void logged_in_successfully() throws Throwable {
	    driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	    WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"header\"]/div[1]/div/div")));
		Assert.assertEquals(driver.getTitle(), "Home");
		System.out.println("Login Successfull !!");
		driver.close();
	}



}
