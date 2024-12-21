package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delete {

	@FindBy(xpath= "//button[contains(text(),' Delete Article')]")
	WebElement deleteBn;
	
	public Delete(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void delete_article(){
		deleteBn.click();
	}
}
