package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class login_stepdefinition {
public WebDriver driver;
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://ui.freecrm.com/");
	    	}
	@After
	public void teardown() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Given("^Page Title is CRM$")
	public void page_Title_is_CRM() {
	  String PageTitle= driver.getTitle();
	  System.out.println(PageTitle);
	  Assert.assertEquals("Cogmento CRM",PageTitle);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(){
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nb@gmail.com");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
	    driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
	    }

	@Then("^user to validate home page$")
	public void user_to_validate_home_page() {
		String PageTitle= driver.getTitle();
		  Assert.assertEquals("Cogmento CRM",PageTitle);
		  	}
	
	
	}
	