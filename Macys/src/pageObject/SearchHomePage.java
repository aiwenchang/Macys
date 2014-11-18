package pageObject;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import util.Driver;
import util.commonUtil;

public class SearchHomePage {

@FindBy(id="globalSearchInputField")
	private WebElement searchField;
	
@FindBy (id="subnavSearchSubmit")
	private WebElement searchBtn;
	public boolean validateSearchTitle(){
		try {
			Assert.assertEquals("jeans - Shop for and Buy jeans Online - Macy&#039;s", Driver.driver.getTitle());
		}catch (Exception e){
			return false;
		}
		return true;
	}
	
	public boolean searchKeyword(String keyword){
		try {
			
			searchField.clear();
			searchField.sendKeys(keyword);
			searchBtn.click();
			commonUtil.implicitWait(10);
		}catch (Exception e){
			return false;
			
		}
		return true;
	}
}
//modified