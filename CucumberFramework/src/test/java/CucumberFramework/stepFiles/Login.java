package CucumberFramework.stepFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class Login {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\David\\Desktop\\CucumberFramework\\CucumberFramework\\src\\test\\java\\CucumberFramework\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		this.driver.manage().deleteAllCookies();
		this.driver.quit();
		this.driver = null;
	}
	
	@Given("User navigates to globalpoem websites")
	public void user_navigates_to_globalpoem_websites() {
		driver.get("http://http://globalpoem.delightservices.com.au");
	}

	@And("User clicks on the Content Management button on homepage")
	public void user_clicks_on_the_Content_Management_button_on_homepage() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Content Management']")).click();
	}

	@And("User enters an invalid username")
	public void user_enters_an_invalid_username() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Yunranx");
	}

	@And("User enters an invalid password")
	public void user_enters_an_invalid_password() {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Cloudspoem");
	}

	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
		driver.findElement(By.xpath("//*[@id='submit']")).click();
	}

	@Then("User should be taken to the unsuccessful login page")
	public void user_should_be_taken_to_the_unsuccessful_login_page() throws InterruptedException {
		Thread.sleep(3000);
		WebElement ExitButton = driver.findElement(By.xpath("//a[text()='Return']"));
		//WebElement ExitButton = driver.findElement(By.xpath("//*[@value='Exit']"));
		Assert.assertEquals(true, ExitButton.isDisplayed());
	}



}
