package StepDefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TC001_AmazonCucNaviHomepage {
	WebDriver driver;


	@Given("^User has opened the browser$")
	public void user_has_opened_the_browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\workspace\\chromedriver\\chromedriver.exe");
	driver= new ChromeDriver();
  
}

	@When("^browser is open$")
	public void browser_is_open() {
	String PageTitle =driver.getTitle();
	System.out.println(PageTitle);
}

	@Then("^Enter url Amazon and go$")
	public void enter_url_Amazon_and_go() {
	driver.get("https://www.amazon.com.au");
	driver.manage().window().maximize();

  
}

	@Then("^Hover over the Account Tab$")
	public void hover_over_the_Account_Tab(){
	WebElement SignInLink = driver.findElement(By.xpath("//div[@class='nav-right']//a[1]"));
	Actions Mouse = new Actions (driver);
	Mouse.moveToElement(SignInLink).build().perform();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  
}

	@Then("^click on SignIn$")
	public void click_on_SignIn() {
	driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

	@Then("^enter username and password and login$")
	public void enter_username_and_password_and_login(){

	driver.findElement(By.id("ap_email")).sendKeys("subuaus@gmail.com");
	driver.findElement(By.id("ap_password")).sendKeys("subin1989");
	WebElement CheckBoxElement = driver.findElement(By.xpath("//input[@type='checkbox']"));
	Boolean Checkbox = CheckBoxElement.isSelected();
	System.out.println("CheckBox is "+Checkbox);
	if(!CheckBoxElement.isSelected()){
		CheckBoxElement.click();
	}


	driver.findElement(By.id("signInSubmit")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	
}

@Then("^Hover on Shop by department tab$")
public void hover_on_Shop_by_department_tab(){
	Actions hover = new Actions (driver);
    hover.moveToElement(driver.findElement(By.id("nav-link-shopall"))).build().perform();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
}

@Then("^Move curser to headphones under Electronics,computer & office$")
public void move_curser_to_headphones_under_Electronics_computer_office(){
  
	Actions hover = new Actions (driver);
	hover.moveToElement(driver.findElement(By.xpath("//div[@class='nav-template nav-flyout-content nav-tpl-itemList']//span[@data-nav-panelkey='ElectronicsAndComputersPanel']"))).build().perform();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@Then("^click on headphones link$")
public void click_on_headphones_link(){
  
	driver.findElement(By.linkText("Headphones")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@Then("^type philips on search tab on Headphones and Earphones page$")
public void type_philips_on_search_tab_on_Headphones_and_Earphones_page(){
  
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("philips");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@Then("^click on philips lighweight in-ear SHE$")
public void click_on_philips_lighweight_in_ear_SHE(){
  

	List<WebElement>Page1ProductList = driver.findElements(By.xpath("//div[@data-index]"));
	String ProductNames = Page1ProductList.toString();
	System.out.println(ProductNames);
}

@Then("^System should navigate to this product page$")
public void system_should_navigate_to_this_product_page(){
  System.out.println("On product page now");
    
}
  
}





