package ConfigPropertiesAmazon;



	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;

	import org.testng.annotations.Test;


public class ReadPropertiesAmazon {
	
	public String InstanceIdNumber;
	static Properties property;
	static FileInputStream fs;


	@Test
	public static String ChromeDriver() throws IOException {
	 fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\ConfigPropertiesAmazon\\confamazon.properties");
	 property = new Properties();
	 property.load(fs);
	 //System.out.println(property.getProperty("chromeDriver"));
	 return property.getProperty("chromeDriver");
	}

	@Test
	public static String WebDriver() throws IOException {
	 fs = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/ConfigProperties/config.properties");
	 property = new Properties();
	 property.load(fs);
	 //System.out.println(property.getProperty("webdriverChromeDriver"));
	 return property.getProperty("webdriverChromeDriver");
	}
	@Test
	public static String URL() throws IOException {
	 fs = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/ConfigProperties/config.properties");
	 property = new Properties();
	 property.load(fs);
	 //System.out.println(property.getProperty("url"));
	 return property.getProperty("url");
	}
	@Test
	public static String Sleep() throws IOException {
	 fs = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/ConfigProperties/config.properties");
	 property = new Properties();
	 property.load(fs);
	 //System.out.println(property.getProperty("url"));
	 return property.getProperty("sleep");
	}
	@Test
	public static String webdriverobject() {
	 //System.out.println(property.getProperty("url"));
	 return property.getProperty("WebDriverObject");
	}
	@Test
	public static String browserName() throws IOException {
	 fs = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/ConfigProperties/config.properties");
	 property = new Properties();
	 property.load(fs);
	 return property.getProperty("Browser");
	 //ReadPropertiesFile.browserName()
	}

	}

