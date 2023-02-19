package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage extends InventoryPage{
@FindBy(xpath="//button[@id='checkout']") private WebElement cart;
@FindBy(xpath="//span[@class='title']") private WebElement title;
@FindBy(xpath="//button[@id='checkout']")private WebElement addtocart11;


public YourCartPage()
{
	PageFactory.initElements(driver, this);
	
}
public String Checkout() throws InterruptedException
{
	Thread.sleep(1000);
	cart.click();
	Thread.sleep(1000);
	return title.getText();
}
}

