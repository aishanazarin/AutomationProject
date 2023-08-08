package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.Lulupage;
public class Lulutest {
WebDriver driver;
	@BeforeClass
	public void setup()
	{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.luluhypermarket.in/en-in");
	}
	@Test
	public void testing() throws Exception
	{
		Lulupage ob = new Lulupage(driver);
		ob.logclick();
		ob.login("nazarinaisha447@gmail.com","LULU@123");
		String ex="HomePage - LuLu Hypermarket India";
		String act =driver.getTitle();
		Assert.assertEquals(act,ex);
		System.out.println("Login verified");
		
		ob.phnclick();
		ob.smartclick();
		ob.dropclick();
		ob.phnadd();
		ob.cartclick();
		ob.checkclick();
		ob.addressadd();
		ob.addressclick("kochi", "9876543232", "mattoor", "kalady", "683574","aluva","kerala"); 
		ob.backward();
		ob.backclick();
		ob.removeclick();
		ob.elecclick();
		ob.hdphnclick();
		ob.audioclick();
		ob.searchclick("shampoo");
		ob.wishclick();
		ob.createclick();
		ob.wishname("My wishlist");
		ob.wadd();
		ob.proclick();
		ob.listclick();
		ob.wishremove();
		ob.proclick();
		ob.logoutclick();
		
		
		
		
		
		
	}
}
