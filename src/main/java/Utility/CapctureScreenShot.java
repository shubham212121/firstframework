package Utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class CapctureScreenShot extends TestBase
{
	public static void screenshot(String name) throws IOException, InterruptedException
	{
		Thread.sleep(2000);
//		Date time = new Date();
//		String timestamp = time.toString().replace(":","").replace(" ", "");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Eclips\\FrameWorkProject\\ScreenShot\\ss"+name+".png");
		FileHandler.copy(src,dest);
	}
}
