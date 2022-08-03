package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends PageBase {

	public Homepage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name ="q")
	WebElement searchInput;
	
	@FindBy(name ="btnk")
	WebElement searchSubmit;
	
	public void search(String input) {

		sendText(searchInput, input);
		clickBtn(searchSubmit);
	}
}
