package Academy.AnExtentReports;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class InvokeTest {
	
	ExtentReports extent = new ExtentReports();
	ExtentTest test ;
	
	@BeforeTest
	public void launchExtenr() {
		
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("Web automation result");
		report.config().setDocumentTitle("Sid Automation Project");
		
	
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Sid");
	}
	
	
	@Test
	public void initialDemo() {
		test = extent.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println("I have added a line in it");
		System.out.println("Added a line from window user");
		System.out.println("Added a line from window user");
		System.out.println("Added a line from window user");
		
		extent.flush();
	}
	
	@Test
	public void initials() {
		test = extent.createTest("Initials");
		Assert.assertTrue(false);
		test.fail("No");
		extent.flush();

	}

}
