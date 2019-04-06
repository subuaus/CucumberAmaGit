package BaseClassAmazon;



	import java.io.IOException;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

	import ConfigPropertiesAmazon.ReadPropertiesAmazon;


public class BaseAmazon {
	public static WebDriver driver;

	@Test
	public static void Initialize() throws IOException {
		ReadPropertiesAmazon f = new ReadPropertiesAmazon();
	 String Browser=f.browserName();
	 System.out.println(Browser);

	 if(ReadPropertiesAmazon.browserName().contains("chrome")) {
	  //---initiate chromebrowser
	  System.setProperty(ReadPropertiesAmazon.WebDriver(),System.getProperty("user.dir")+ReadPropertiesAmazon.ChromeDriver());
	  driver = new ChromeDriver();
	  WaitTime();
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();

	 }
	 else if(ReadPropertiesAmazon.browserName().contains("Firefox")) {
	  //System.setProperty("webdriver.gecko.driver", ReadPropertiesFile.GecDriverLoc());
	  driver = new FirefoxDriver();
	  //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.manage().window().maximize();

	 }

	}
	public static void WaitTime() {

	 // //----This line means wait 10 sec-----
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void close() {

	 driver.close();
	 driver=null;
	}
	public static void quit() {

	 driver.quit();
	 driver=null;
	}

	}

