package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Actions.Click;
import Actions.Enter;
import UI.PersonalUserUI;

public class AddUserPersonal {
	
	public static void withData(WebDriver driver, String firstname, String lastName, 
			                    String email) {
		
		Enter.text(driver, PersonalUserUI.firstNameImput, firstname);
		Enter.text(driver, PersonalUserUI.lastNameImput, lastName);
		Enter.text(driver, PersonalUserUI.emailImput, email);
		
	    Click.on(driver, PersonalUserUI.birthMonthSelect);
	    {
	      WebElement dropdown = driver.findElement(By.id("birthMonth"));
	      dropdown.findElement(By.xpath("//option[. = 'January']")).click();
	    }
	    Click.on(driver, PersonalUserUI.birthDaySelect);
	    {
	      WebElement dropdown = driver.findElement(By.id("birthDay"));
	      dropdown.findElement(By.xpath("//option[. = '12']")).click();
	    }
	    Click.on(driver, PersonalUserUI.birthYearSelect);
	    {
	      WebElement dropdown = driver.findElement(By.id("birthYear"));
	      dropdown.findElement(By.xpath("//option[. = '1985']")).click();
	    }
	    
	    Click.on(driver, PersonalUserUI.nextButton);
	    
	    

		
	}

}
