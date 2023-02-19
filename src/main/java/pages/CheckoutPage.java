package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends YourCartPage{
	@FindBy(xpath = "//input[@id='first-name']")private WebElement FirstName;
	@FindBy(xpath = "//input[@id='last-name']")private WebElement LastName;
	@FindBy(xpath = "//input[@id='postal-code']")private WebElement PostalCode;
	@FindBy(xpath = "//input[@id='continue']")private WebElement ContinueBtn;
	@FindBy(xpath = "//span[text()='Checkout: Overview']")private WebElement title;
	@FindBy(xpath = "(//div[@class='cart_item_label'])[1]")private WebElement product1;
	public CheckoutPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String CheckoutDetail() throws InterruptedException
	{
		FirstName.sendKeys("shubham");
		LastName.sendKeys("upare");
		PostalCode.sendKeys("442401");
		ContinueBtn.click();
		System.out.println(product1.getText());
		return title.getText();
	}
}
