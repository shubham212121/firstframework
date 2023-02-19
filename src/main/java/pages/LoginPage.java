package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.readExcel;

public class LoginPage extends TestBase{
	
	
	@FindBy(xpath = "//input[@id='user-name']")private WebElement username; 
	@FindBy(xpath = "//input[@id='password']")private WebElement password;
	@FindBy(xpath = "//input[@id='login-button']")private WebElement loginbtn;
	@FindBy(xpath = "//div[@class='login_logo']")private WebElement logo1;
	@FindBy(xpath = "//div[@class='bot_column']")private WebElement logo2;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
public String verifyTitle()
{
	return driver.getTitle();
	
}
public String verifyurl()
{
	return driver.getCurrentUrl();
}
public boolean verifylogo()
{
	return driver.findElement(By.xpath("//div[@class='login_logo']")).isDisplayed();
}
public String loginPageInApp() throws InterruptedException, IOException
{
	username.sendKeys(readExcel.readpropfile("username"));
	password.sendKeys(readExcel.readpropfile("password"));
	loginbtn.click();
	return driver.getCurrentUrl();
}
}
