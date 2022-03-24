package org.sde;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Seleniumintro {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https//www.facebook.com/");
		

		driver.manage().window().maximize();

		String url = driver.getCurrentUrl();
		System.out.println(url);

		String title = driver.getTitle();
		System.out.println(title);

		// driver.close();
		// driver.quit();

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
