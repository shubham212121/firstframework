package Base;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test case is staring");
		
	}
public void onTestSucess(ITestResult result) {
		
		
	}
public void onTestFailure(ITestResult result) {
	System.out.println("Test case Failed ");
	try {
		Utility.CapctureScreenShot.screenshot();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void onTestSkipped(ITestResult result) {
	
	
}

}
