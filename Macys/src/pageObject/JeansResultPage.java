package pageObject;

import java.awt.PageAttributes.PrintQualityType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.Driver;

public class JeansResultPage {
	/**
	 *
	 * @return
	 */

	public static List<Data> getLinks() {
		try {
			// driver.findElement(By.id("element id"))
			WebElement landingpage = Driver.driver.findElement(By
					.id("search_landing_product"));
			List<WebElement> productslist = landingpage.findElements(By
					.className("shortDescription"));

			ArrayList<Data> res = new ArrayList();

			for (WebElement product : productslist) {
				String link = product.findElement(By.tagName("a"))
						.getAttribute("href");
				String desc = product.findElement(By.tagName("a")).getText();
				String brand = desc.substring(0, desc.indexOf(' '));

				res.add(new Data(link, brand, desc));
			}
			return res;

		} catch (Exception e) {
			System.out.println("error " + e);
			return Collections.emptyList();
		}
	}
	public JeansResultPage nextBtn() {
 
        Driver.driver.findElement(By.id("paginateBottom")).click();
        return new JeansResultPage ();    
    }

}