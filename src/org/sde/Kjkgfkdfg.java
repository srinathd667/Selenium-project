package org.sde;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Kjkgfkdfg {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium project\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();

		// WebElement element = driver.findElement(By.xpath(""));
		// Actions a = new Actions(driver);
		// a.moveToElement(element).perform();

		// WebElement user = driver.findElement(By.id("email"));
		// user.sendKeys("srinath");

		// Actions a = new Actions(driver);
		// a.doubleClick(user).perform();
		// a.contextClick(user).perform();

		// Robot r = new Robot();
		// for (int i=0 ; i < 4 ; i++) {
		// }
		// r.keyPress(KeyEvent.VK_DOWN);
		// r.keyRelease(KeyEvent.VK_DOWN);
		//
		// r.keyPress(KeyEvent.VK_ENTER);
		// r.keyRelease(KeyEvent.VK_ENTER);

		// r.keyPress(KeyEvent.VK_TAB);
		// r.keyRelease(KeyEvent.VK_TAB);

		// r.keyPress(KeyEvent.VK_DOWN);
		// r.keyRelease(KeyEvent.VK_DOWN);

		WebElement drag = driver.findElement(By.xpath("fkjdkfjdk"));
		WebElement drop = driver.findElement(By.xpath("dkfjskfsd"));

		Actions acc = new Actions(driver);
		acc.dragAndDrop(drag, drop).perform();

		// TakesScreenshot
		TakesScreenshot tk = (TakesScreenshot) driver;
		File fileType = tk.getScreenshotAs(OutputType.FILE);
		File store = new File("dfdsffds");
		FileUtils.copyFile(fileType, store);

	}

}
