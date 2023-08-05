package mohanAutomationProject;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsExample {

	ExtentReports extent;

	// @Test(enabled=false)
	public ExtentReports reporter1() {
		String path = System.getProperty("user.dir") + "//Reports//Index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);

		reporter.config().setReportName("Test results");
		reporter.config().setDocumentTitle("Automation results");

		extent = new ExtentReports();

		extent.attachReporter(reporter);
		return extent;
	}

	// @Test(priority = 1)
	public void test1() {
		reporter1().createTest("test1");
		System.out.println("My test 1");
		reporter1().flush();
	}

	// @Test(priority=2)
	public void test2() {
		reporter1().createTest("test1");
		System.out.println("My test 2");
		reporter1().flush();
	}

	public static void main(String[] args) {
		ExtentReportsExample obj1 = new ExtentReportsExample();
		obj1.test1();
		obj1.test2();
	}

}
