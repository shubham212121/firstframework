package pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility.readExcel;

public class InventoryPage extends LoginPage{
@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")private WebElement addtocart1;
@FindBy(xpath="//a[@class='shopping_cart_link']")private WebElement cartlogo;
@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")private WebElement addtocart2;
@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")private WebElement addtocart3;
@FindBy(xpath="//select[@class='product_sort_container']")private WebElement productsort;
@FindBy(xpath="//span[@class='shopping_cart_badge']")private WebElement cartvalue;

public InventoryPage()
{
	PageFactory.initElements(driver, this);
}
public void addinventory() throws InterruptedException, EncryptedDocumentException, IOException
{
	
	addtocart1.click();
	addtocart2.click();
}
public String addinventory1() throws InterruptedException, EncryptedDocumentException, IOException
{
	
	Select s = new Select(productsort);
	s.selectByVisibleText(readExcel.readexcelfile(5,0));
	addtocart3.click();
	System.out.println("Cart Value Is : "+cartvalue.getText());
	cartlogo.click();
	return cartvalue.getText();
}
}
