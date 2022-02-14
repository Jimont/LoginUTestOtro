package Tasks;

import org.openqa.selenium.WebDriver;

import Actions.Click;
import UI.AddressUserUI;

public class AddUserAddress {
	
	public static void withData(WebDriver driver) {
		Click.on(driver, AddressUserUI.nextDevicesButton);
		
			}

}
