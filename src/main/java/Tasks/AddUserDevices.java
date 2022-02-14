package Tasks;

import org.openqa.selenium.WebDriver;

import Actions.Click;
import UI.DevicesUserUI;

public class AddUserDevices {
	
	public static void withData(WebDriver driver) {
		Click.on(driver, DevicesUserUI.nextLastStepButton);
	}

}
