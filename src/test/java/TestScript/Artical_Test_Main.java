package TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.Delete;
import Pages.Edit_Article;
import Pages.LoginPage;
import Pages.New_Article;

public class Artical_Test_Main {
	WebDriver driver;
	LoginPage loginPage;
	New_Article new_article;
	Edit_Article edit;
	Delete delete;

	//Constructor
	public Artical_Test_Main() {
		TestBase.initDriver();
		driver = TestBase.getDriver();
		loginPage = new LoginPage(driver);
		new_article = new New_Article(driver);
		edit = new Edit_Article(driver);
		delete = new Delete(driver);
	
	}
	
  
	//Home_Page
	@BeforeTest
	public void setup() {
		TestBase.openURL("https://conduit-realworld-example-app.fly.dev/#/");
		
	}
	
	//login 
	@Test(priority =1)
	public void loginTest() {
		loginPage.homePage();
		loginPage.validLogin("prasadakhare2003@gmail.com", "Prasad@2003");
	}
	
	//new Article
	@Test(priority =2)
	public void new_Articale() throws InterruptedException {
		Thread.sleep(5000);
		new_article.new_Articale();
		new_article.add_details("Anguler", "About Java Technology", "Learning a java from scracth", "Java Learining");
		new_article.publish_Articale();
	}
	//edit Article
	@Test(priority =3)
	public void edit_article() throws InterruptedException {
		
		edit.edit_article();
		Thread.sleep(5000);
		edit.add_details("Seleniump", "About Selenium Technology", "Learning a Selenium from scracth", "Selenium Learining");
		edit.publish_Articale();
	}
	//Delete Article
	@Test(priority =4)
	public void delete() throws InterruptedException {
		Thread.sleep(10000);
		delete.delete_article();
	}
	
}
