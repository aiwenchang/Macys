package pageObject;

import java.awt.PageAttributes.PrintQualityType;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.Driver;


public class JeansResultPage {
// @FindBy(id)

/**
* @param nothing is passed in
*/
public static void getLinks() {
try {
//driver.findElement(By.id("element id"))
WebElement landingpage = Driver.driver.findElement(By.id("search_landing_product"));


//List<WebElement> productslist = 
//landingpage.findElements(By.className("shortDescription"));

//driver.findElement(By.className("element class"))

//assertEquals(20, links.size());
//System.out.println(productslist.size());

//for (WebElement product : productslist) {
//System.out.println(product.findElement(By.tagName("a")).getAttribute("href"));
//System.out.println("");
//System.out.println(product.findElement(By.tagName("a")).getText());
//
//}
} catch (Exception e) {
System.out.println("error " + e);
}
}

}
