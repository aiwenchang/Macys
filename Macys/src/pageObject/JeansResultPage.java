package pageObject;

import java.awt.PageAttributes.PrintQualityType;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.Driver;


public class JeansResultPage {


/**
* @param nothing is passed in
 * @return 
*/
	

public static List<WebElement> getLinks() {
try {
//driver.findElement(By.id("element id"))
WebElement landingpage = Driver.driver.findElement(By.id("search_landing_product"));
List<WebElement> productslist =landingpage.findElements(By.className("shortDescription"));

for (WebElement product : productslist) {
System.out.println(product.findElement(By.tagName("a")).getAttribute("href"));
System.out.println(product.findElement(By.tagName("a")).getText());
System.out.println("");

}
return productslist;
} catch (Exception e) {
System.out.println("error " + e);
return Collections.emptyList();
}
}

}
