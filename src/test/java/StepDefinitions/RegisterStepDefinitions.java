package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import Tasks.AddUserAddress;
import Tasks.AddUserComplete;
import Tasks.AddUserDevices;
import Tasks.AddUserPersonal;
import Tasks.HomePageInit;
import io.cucumber.java.en.*;

public class RegisterStepDefinitions {

	WebDriver driver = null;

	@Given("^browser on the home page$")
	public void browser_on_the_home_page() {
		String proyectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				proyectPath + "/src/test/resources/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://utest.com/");

	}

	@When("^The new user diligence all fields$")
	public void the_new_user_diligence_all_fields() throws InterruptedException {
		HomePageInit.as(driver);
		AddUserPersonal.withData(driver, "Bart", "Simpson", "holass@correo.com");
		Thread.sleep(2000);
		AddUserAddress.withData(driver);
		AddUserDevices.withData(driver);
		AddUserComplete.withData(driver, "Canada_2021", "Canada_2021");

	}

	@Then("^The user enters the platform$")
	public void the_user_enters_the_platform() {
		System.out.println("ingresa a la plataforma");
	}
}
