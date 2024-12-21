package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit_Article {
	@FindBy(xpath="//a[@class='nav-link']")
	WebElement  edit_article_Btn;
	@FindBy(xpath ="//input[@name='title']")
	WebElement title;
	
	@FindBy(xpath = "//input[@name='description']")
	WebElement abaut;
	@FindBy(xpath = "//textarea[@name='body']")
	WebElement body;
	@FindBy(xpath = "//input[@name='tags']")
	WebElement tags;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement updateBtn;

	public Edit_Article(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void edit_article(){
		edit_article_Btn.click();
	}
	
	public void add_details(String strtitle, String strabout, String strbody , String strtags) {
      title.sendKeys(strtitle);
	   abaut.sendKeys(strabout);
	   body.sendKeys(strbody);
	   tags.sendKeys(strtags);
	  
		
	}
	public void publish_Articale(){
		updateBtn.submit();
	}
	
	
}
