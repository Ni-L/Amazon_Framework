package Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class amazonSignUp {
	private static final String Setup = null;


	WebDriver driver;
	
	
	//Create an Account  Page
	@FindBy(xpath="//a[@class='a-button-text']")
	WebElement createnew;
	@FindBy(id="ap_customer_name")
	WebElement yourname;
	@FindBy(name="email")
	WebElement mobile;
	@FindBy(id="ap_email")
	WebElement email;
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continuetopage;
	
//	 @FindBy(id="twotabsearchtextbox")
//	   WebElement searchitem;
	
	//Sign In Page
//	@FindBy(xpath="//a[contains(text(),'Sign in')]")
//	WebElement signin;
	
	
	public void CreateAnAccount()
	{
		createnew.click();
	}
	
	public void Entername(String name)
	{
		yourname.sendKeys(name);
	}
	
	public void Enternumber(String number)
	{
		mobile.sendKeys(number);
	}
	public void Enteremail(String emailaddress)
	{
		email.sendKeys(emailaddress);
	}
	public void Password(String pass)
	{
		password.sendKeys(pass);
	}
	public void Continue()
	{
		continuetopage.click();
	}
//	public void SearchItem(String item)
//	{
//		searchitem.sendKeys(item);
//	}
//	public void signIn(String Enter)
//	{
//		signin.sendKeys(Enter);
//	}
	
	@BeforeTest
	 public void Setup() {
     	System.setProperty("webdriver.chrome.driver","/Bridgelabz/JAVA/SeleniumWebdriver/driver1/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");  
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		//driver.findElement(By.xpath("//a[@class='a-button-text']")).click();
        System.out.println("We are on Amazon Page");
		PageFactory.initElements(driver, this);	
  }
		 	
       @Test(priority=0)
       public void AddValue() throws InterruptedException
       {
    	   createnew.click();
    	   yourname.sendKeys("Nilima");
    	   mobile.sendKeys("9878678908");
    	   email.sendKeys("nilima@gmail.com");
    	   password.sendKeys("Nil@34");
    	   Continue();
    	   Thread.sleep(3000);
    	   
    	  // driver.navigate().to("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&prevRID=5VPQF4E87EN5X3PQVJQN&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

    	   
       }
       @Test(priority=1)
       public void Search()
       { 
    	   driver.get("https://www.amazon.in");
    	   //driver.switchTo().activeElement();
    	   //driver.navigate().to("https://www.amazon.in/");
    	 //driver.switchTo().frame(Setup);
       }
}
