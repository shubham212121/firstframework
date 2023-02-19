package pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStage2 extends CheckoutPage {
	@FindBy(xpath = " //div[@class='cart_list']")private WebElement cart_list;
	@FindBy(xpath = " //div[@class='summary_info']")private WebElement summary_info  ;
	@FindBy(xpath = " //button[@id='finish']")private WebElement finish;
	@FindBy(xpath = "//h2[text()='THANK YOU FOR YOUR ORDER']")private WebElement CompleteOrder;
	
	public CheckoutStage2()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String finalcartdetails() throws InterruptedException, IOException
	{
		String cartdetails = cart_list.getText();
		
		Date time = new Date();
		String timestamp = time.toString().replace(":","").replace(" ", "");
		
		File source = cart_list.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Eclips\\FrameWorkProject\\ScreenShot\\ss"+timestamp+".png");
		FileHandler.copy(source, dest);
		
		Thread.sleep(2000);
		String paymentdetails = cart_list.getText();
		Thread.sleep(2000);
		System.out.println(cartdetails);
		Thread.sleep(2000);
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println(paymentdetails);
		finish.click();
		
		return CompleteOrder.getText();}
		
	public void screenshot() throws IOException, InterruptedException
	{
		Date time = new Date();
		String timestamp = time.toString().replace(":","").replace(" ", "");
		File source = cart_list.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Eclips\\FrameWorkProject\\ScreenShot\\ss"+timestamp+".png");
		FileHandler.copy(source, dest);
	}
	}
	
