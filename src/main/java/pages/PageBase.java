package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	
	protected WebDriver driver;

	//Constructor
	public PageBase(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	protected static void clickBtn(WebElement btn) {
		btn.click();
	}
	
	protected static void sendText(WebElement textElement, String textValue) {
		textElement.sendKeys(textValue);
	}
}
