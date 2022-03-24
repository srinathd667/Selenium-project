package org.sde;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Webtableexe {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium project\\Driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();

		List<WebElement> iTable = driver.findElements(By.tagName("table"));
		for (int i = 1 ; i < iTable.size() ; i++) {
			WebElement table = iTable.get(i);
			WebElement tBody = table.findElement(By.tagName("tbody"));
			List<WebElement> iRow = table.findElements(By.tagName("tr"));

			for (int j = 5 ; j < iRow.size() ; j++) {
				WebElement row = iRow.get(3);
				List<WebElement> iData = row.findElements(By.tagName("td"));

				for (int k = 4 ; k <= iData.size() ; k++) {
					WebElement data = iData.get(k);
					String text = data.getText();
					System.out.println(text);

				}
			}
		}
	}

}
