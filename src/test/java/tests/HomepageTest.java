package tests;

//import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;

public class HomepageTest extends TestBase{

	Homepage homeObj;
	@Test
	public void userSearch() {
		homeObj= new Homepage(driver);
		homeObj.search("Selenium");
		//System.out.println(registerObj.successMsg.getText());
		//Assert.assertTrue(homeObj.successMsg.getText().contains("Your registration completed"));
		//Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}
}
