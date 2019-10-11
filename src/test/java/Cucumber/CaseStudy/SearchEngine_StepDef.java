package Cucumber.CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchEngine_StepDef {
	WebDriverWait wait;
	WebDriver driver;
	@Given("^user should be in Search Page$")
	public void user_should_be_in_Search_Page() throws Throwable 
	{
	    driver=UtilityClass.startBrowser("Chrome", "http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
	    driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	    driver.findElement(By.name("userName")).sendKeys("lalitha");
	    driver.findElement(By.name("password")).sendKeys("Password123");
	    driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	    System.out.println("Login Successfull !!");
	  }

	@When("^user search for the product by entering \"([^\"]*)\", add to cart and proceed to payment$")
	public void user_search_for_the_product_by_entering_add_to_cart_and_proceed_to_payment(String arg1) throws Throwable {
		
		
	    driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(arg1);
	   driver.findElement(By.xpath("/html/body/div[1]/form/div[1]/input")).click();//HEADPHONES
	    driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();//find details
	   // driver.get("http://10.232.237.143:443/TestMeApp/findProduct.htm");//next url
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();//add to cart
	    WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"header\"]/div[2]")));
		
	    //driver.get("http://10.232.237.143:443/TestMeApp/fetchSubCat.htm?val=search");
	    driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/a[2]")).click();
	    driver.findElement(By.xpath("/html/body/main/section/div[3]/table/tfoot/tr[2]/td[5]/a")).click();
	    driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	    driver.get("http://10.232.237.143:443/PaymentGateway/getOrderDetails.htm");
	    driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div[1]/div[1]/div/label/i")).click();
	    driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/a")).click();
	    driver.findElement(By.name("username")).sendKeys("123456");
	    driver.findElement(By.name("password")).sendKeys("Pass@456");
	    driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	    driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
	    driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	   
	    
	}

	@Then("^user gets the order confirmation$")
	public void user_gets_the_order_confirmation() throws Throwable {
		 driver.get("http://10.232.237.143:443/TestMeApp/fromPayment.htm?custid=11105");
		    driver.findElement(By.xpath("/html/body/header/div/div/ul/b/a[2]")).click();
		    System.out.println("Head Phones Ordered Successfully");
		    driver.close();
	}

	@Given("^user should be in search page$")
	public void user_should_be_in_search_page() throws Throwable {
		
		driver=UtilityClass.startBrowser("Chrome", "http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
	    driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	    driver.findElement(By.name("userName")).sendKeys("lalitha");
	    driver.findElement(By.name("password")).sendKeys("Password123");
	    driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	    System.out.println("Login Successfull !!");
	  }


	@When("^user searches for the invalid product as \"([^\"]*)\"$")
	public void user_searches_for_the_invalid_product_as(String arg1) throws Throwable 
	{
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(arg1);
	    driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();//find details
	    WebDriverWait wait= new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"header\"]/div[2]")));
		

	}
	@Then("^user gets notifies about the invalid product$")
	public void user_gets_notifies_about_the_invalid_product() throws Throwable {
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"header\"]/div[2]")));
		System.out.println("Invalid Search");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[1]")).click();
		driver.close();
		
	}

	@Given("^user is already registered in testme$")
	public void user_is_already_registered_in_testme() throws Throwable {
	   
	}

	@When("^user searches for the product by entering \"([^\"]*)\" but doesnot add to cart$")
	public void user_searches_for_the_product_by_entering_but_doesnot_add_to_cart(String arg1) throws Throwable {
	    
	}

	@Then("^user tries to display the cart and finds no item in cart$")
	public void user_tries_to_display_the_cart_and_finds_no_item_in_cart() throws Throwable {
	    
	}


}
