package Tasks;

import org.openqa.selenium.WebDriver;

import Actions.Click;
import UI.HomePageUI;

public class HomePageInit {
	
	public static void as(WebDriver driver) {
		Click.on(driver, HomePageUI.homeButton);
	}

}
