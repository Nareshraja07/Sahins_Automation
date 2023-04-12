package org.stepdefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginFeature {
	public static WebDriver driver;

	@Given("User have to Launch chrome browser and launch Sahins URL")
	public void user_have_to_launch_chrome_browser_and_launch_sahins_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://sahins-dev.agiratech.com/");
	}

	@And("User have to maximize the window")
	public void user_have_to_maximize_the_window() {
		driver.manage().window().maximize();
	}

	@When("user have to enter username and password")
	public void user_have_to_enter_username_and_password() {
		driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("sahins@agiratech.com");
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Sahins@123");
	}

	@Then("User have to click login button")
	public void user_have_to_click_login_button() {
		driver.findElement(By.xpath("//span[text()=' Login ']")).click();
	}

	@Then("User is on Dashboard Screen")
	public void user_is_on_dashboard_screen() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-icon[text()='menu']")).click();
		driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();
	}
}