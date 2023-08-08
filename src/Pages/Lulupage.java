package Pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Lulupage {
WebDriver driver;
	By log = By.xpath("//*[@id=\"header\"]/section/div/div/div[4]/ul/li[3]/a/span/b");
	By email =By.xpath("//*[@id=\"emailAddress\"]");
	By pwd = By.xpath("//*[@id=\"j_password\"]");
	By sigin = By.xpath("//*[@id=\"loginForm\"]/div[8]/button");
	By phone = By.xpath("/html/body/main/section[3]/section[1]/div/div[2]/div/div[4]/a/div[1]/img");
	By smartphn = By.xpath("/html/body/main/section[3]/section[3]/div/div[2]/div/div[1]/div/div[3]/div/div[2]/a");
	By drop = By.xpath("//*[@id=\"dropdownMenuButton\"]");
	By dvalue = By.xpath("//*[@id=\"clp-container-fluid\"]/div/div/div[2]/div/div/div[1]/div[2]/form/div[2]/div/div/a[4]");
	By add = By.xpath("//*[@id=\"pdpAddtoCartInput_1482932\"]");

    By cart = By.xpath("//*[@id=\"header\"]/section/div/div/div[4]/ul/li[4]/a[2]/span");
    By checkout = By.xpath("//*[@id=\"checkoutitems\"]");
	By address = By.xpath("//*[@id=\"checkout-section\"]/div/div/div/div[1]/div[2]/div[2]/ul/li[1]/div/div/div/div");
 	By location = By.xpath("//*[@id=\"pac-input\"]");
	By confirm = By.xpath("/html/body/main/section[4]/section/div/div/div[2]/div[1]/div[2]/div[1]/div[4]/button");
	By phno =By.xpath("//*[@id=\"address_mobilePhone\"]");
	By addline1 = By.xpath("//*[@id=\"address.line1\"]");
	By addline2 = By.xpath("//*[@id=\"address.line2\"]");
	By post= By.xpath("//*[@id=\"address.postalcode\"]");
	By area = By.xpath("//*[@id=\"address.areaName\"]");
	//By district = By.id("//*[@id=\"address.districtName\"]");
	By state = By.xpath("//*[@id=\"address.stateName\"]");
    //By cancel = By.xpath("//*[@id=\"lulu-address-add-form\"]/div[2]/div/div/div[2]/button");
	By back = By.xpath("/html/body/main/header/section[2]/nav/div/div/div/div[1]/a");
	By remove = By.xpath("//*[@id=\"remove-desktop-1482932\"]");
	By electronics = By.xpath("/html/body/main/header/section[2]/nav/div/div[1]/div[2]/div/ul/li[4]/a");
	By headphone = By.xpath("/html/body/main/header/section[2]/nav/div/div[1]/div[2]/div/ul/li[4]/div/div/div/div/div/div[3]/div[2]/ul/li[3]/span/a");
	By audio =By.xpath("//*[@id=\"category\"]/div/ul/li[1]/div/form/label");
	By search = By.xpath("//*[@id=\"js-site-search-input auto-search\"]");
	By wish = By.xpath("//*[@id=\"958344\"]");
	By createwish = By.xpath("//*[@id=\"wishListButton\"]");
	By newwish = By.xpath("//*[@id=\"AddToWhislistPopupModal\"]/div/div/div[2]/div/form/div[1]/div/div/a[1]");
	By wishname = By.xpath("//*[@id=\"listName\"]");
	By wadd = By.xpath("//*[@id=\"addBtn\"]");
	By profile = By.xpath("//*[@id=\"profile-dropdown\"]/span[1]");
	By wishlist = By.xpath("//*[@id=\"header\"]/section/div/div/div[4]/ul/li[3]/div/div/ul/li[4]/a");
	By Wdrop = By.xpath("/html/body/main/section[4]/section/div/div/div[2]/div[2]/fieldset/div[1]/ul/li/fieldset/div[1]/div/div[3]/span");
	By wremove = By.xpath("//*[@id=\"wishRemoveForm958344\"]/a");
			//xpath("//*[@id=\"wishRemoveForm958344\"]/a");
	By logout = By.xpath("//*[@id=\"header\"]/section/div/div/div[4]/ul/li[3]/div/div/ul/li[9]/a");

	
	
	public Lulupage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void flipresponse() throws Exception
	{
		driver.manage().window().maximize();
	}
	
	public void logclick()
	{
		driver.findElement(log).click();
	}
	
	public void login(String uname,String pass)
	{   
		driver.findElement(email).click();
		driver.findElement(email).sendKeys(uname);
		driver.findElement(pwd).click();
		driver.findElement(pwd).sendKeys(pass);
		driver.findElement(sigin).click();
	}
	
	
	 public void phnclick()
	 {
		 driver.findElement(phone).click();
	 }
	 public void smartclick()
	 {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(smartphn));
		 driver.findElement(smartphn).click();
		 
		 
	 }
	 public void dropclick()
	 {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(drop));
		 driver.findElement(drop).click();
		 driver.findElement(dvalue).click();
	}
	public void phnadd()
	{
		driver.findElement(add).click();
	}
	public void cartclick()
	{
		driver.findElement(cart).click();
		
	}
	public void checkclick()
	{
		driver.findElement(checkout).click();
		
	}
	public void addressadd()
	{

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(address));
		driver.findElement(address).click();
	}
	public void addressclick(String l,String p,String a1,String a2,String po,String ar,String st)
	{
		driver.findElement(location).click();
		driver.findElement(location).sendKeys(l);
		driver.findElement(confirm).click();
		driver.findElement(phno).click();
		driver.findElement(phno).sendKeys(p);
		driver.findElement(addline1).click();
		driver.findElement(addline1).sendKeys(a1);
		driver.findElement(addline2).click();
		driver.findElement(addline2).sendKeys(a2);
		driver.findElement(post).click();
	    driver.findElement(post).sendKeys(po);
		driver.findElement(area).click();
		driver.findElement(area).sendKeys(ar);
		//driver.findElement(district).click();
        //driver.findElement(district).sendKeys(d);
		driver.findElement(state).click();
		driver.findElement(state).sendKeys(st);
		
			
	}
	
	public void backward()
	{
		driver.navigate().back();
    }
	public void backclick()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(back));
		driver.findElement(back).click();
	}
	public void removeclick()
	{
		driver.findElement(remove).click();
	}
	public void elecclick()
	{
		 WebElement e = driver.findElement(electronics);
		 Actions a = new Actions(driver);
		 a.moveToElement (e);
		 a.perform();
		 
	}
	public void hdphnclick()
	{
		driver.findElement(headphone).click();	
		
	}
	public void audioclick()
	{
		driver.findElement(audio).click();
	}
	public void searchclick(String s)
	{
		driver.findElement(search).click();
		driver.findElement(search).sendKeys(s);
		driver.findElement (search).sendKeys(Keys.ENTER);
	}
	
	public void wishclick()
	{
		driver.findElement(wish).click();
	}
	public void createclick()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(createwish));
		driver.findElement(createwish).click();
		driver.findElement(newwish).click();
		
	}
	public void wishname(String w) 
	{
	driver.findElement(wishname).click();
	driver.findElement(wishname).sendKeys(w);
	}
	
	public void wadd()
	{
		driver.findElement(wadd).click();
		
	}
	public void proclick()
	{
		driver.navigate().refresh();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(profile));
		driver.findElement(profile).click();
		
	}
	public void listclick()
	{
		driver.findElement(wishlist).click();
	}
	public void wishremove()
	{
		driver.findElement(Wdrop).click();
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(wremove));
		driver.findElement(wremove).click();
		
	}
	public void logoutclick()
	{
		driver.findElement(logout).click();
	}

	
}
