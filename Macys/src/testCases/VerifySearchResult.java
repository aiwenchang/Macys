package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import pageObject.JeansResultPage;
import pageObject.SearchHomePage;
import util.Driver;
import util.commonUtil;

public class VerifySearchResult {
	SearchHomePage searchjeans;
	JeansResultPage resultList;
  @Test
  public void verifyItems() {
	  searchjeans.searchKeyword("jeans");
	  Assert.assertEquals(40, JeansResultPage.getLinks().size());
	  resultList.getLinks();
  }
  
  @BeforeClass
  public void beforeClass() {
		Driver.driver = Driver.browser("firefox");
		searchjeans= PageFactory.initElements(Driver.driver, SearchHomePage.class);
		resultList= PageFactory.initElements(Driver.driver, JeansResultPage.class);
		commonUtil.launchBrowser("http://www.macys.com/");
  }

  
  @AfterClass
  public void afterClass() {
  Driver.driver.quit();
  }

}


