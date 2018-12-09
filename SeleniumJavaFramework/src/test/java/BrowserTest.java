import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	public static void main(String[] args) {
		
		String path= System.getProperty("user.dir");
	//	System.out.println(path);
		System.setProperty("webdriver.gecko.driver",path+"\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumhq.org");
	}

}
