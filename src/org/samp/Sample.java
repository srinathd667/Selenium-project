package org.samp;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
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

public class Sample {

	public static void main (String[] args) {
		 File f = new File("C:\\Users\\admin\\eclipse-workspace\\MavenProject\\src\\test\\resources");
		 FileInputStream f1 = new FileInputStream(f);
		 Workbook w = new XSSFWWorkbook(f1);
		 Sheet s = w.getSheet("Sheet1");
		 for(int i=0 ; i < s.getPhysicalNumberOfRows() ; i++) {
			 Row r = s.getRow(i);
			 
			 for(int j = 0 ; j < r.getPhysicalNumberOfCells(); j++) {
				 Cell c = r.getCell(j);
				 int cellType = c.getCellType();
				 
				 if(cellType==1) {
					 String name = c.getStringCellValue();
					 System.out.println(name);
				 }
				 
				 else if (cellType==0) {
					 if (DateUtil.isCellDateFormatted(c)) {
						 Date d = c.getDateCellValue();
						 SimpleDateFormat sd =  new	SimpleDateFormat("MM/DD/YYYY");
						String name =  sd.format(d);
						System.out.println(name);
					 }
					 else {
						 double d = c.getNumericCellValue();
						 long l = (long)d;
						 String name = String.valueOf(l);
						 System.out.println(name);
					 }
				 }
			 }
			 
			 
		 }
		 
	
	
	
	

	
	
	for
	
	
	
	}

}
