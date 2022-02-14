package Tasks;

import org.openqa.selenium.WebDriver;

import Actions.Click;
import Actions.Enter;
import UI.CompleteUserUI;

public class AddUserComplete {
	
	public static void withData(WebDriver driver, String password, String confirmPassword) {
		Enter.text(driver, CompleteUserUI.passwordImput, password);
		Enter.text(driver, CompleteUserUI.confirmPasswordImput, confirmPassword);
		Click.on(driver, CompleteUserUI.termOfUseCheck);
		Click.on(driver, CompleteUserUI.privacySettingCheck);
		Click.on(driver, CompleteUserUI.completeSetupButton);
	}

}
