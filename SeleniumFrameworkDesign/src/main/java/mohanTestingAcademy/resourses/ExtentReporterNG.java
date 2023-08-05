 package mohanTestingAcademy.resourses;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	public static ExtentReports getReportObject() {
		// Java has ExtentSpartReporter, ExtentReports classes to create a Extent reports for test scripts
				// 1. Create reporter object using ExtentSparkReporter class to configure the Extent reports 
				String path = System.getProperty("user.dir")+ "//Reports//index.html";
				ExtentSparkReporter reporter = new ExtentSparkReporter(path);
				reporter.config().setReportName("Web Automation Results");
				reporter.config().setDocumentTitle("Test Results");
				
				// 2. Create a extent object to attache the reporter to the extent object and then we can use that extent object the test scripts
				ExtentReports extent = new ExtentReports();
				extent.attachReporter(reporter);
				extent.setSystemInfo("Tester", "Mohan");
				
				return extent;
	}

}
