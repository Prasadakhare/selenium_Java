package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//a[@class='nav-link ']")
	WebElement loginBtnHome;
	
	@FindBy(xpath ="//input[@name='email']")
	WebElement email;
	@FindBy(xpath = "//input[@name='password']")
	WebElement pass ;
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void homePage() {
		loginBtnHome.click();
	}
	public void validLogin(String strUser, String strPwd) {

		email.sendKeys(strUser);
		pass.sendKeys(strPwd);
		loginBtn.click();
	}
	
	
}
