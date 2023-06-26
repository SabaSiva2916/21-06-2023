package org.browser;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {

	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/");
	driver.findElement(By.id("email")).sendKeys("aji");
	driver.findElement(By.id("pass")).sendKeys("1234");
	driver.findElement(By.name("login")).click();
	TakesScreenshot ts = (TakesScreenshot) driver;
	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	File f = new File("C:\\Users\\sabas\\OneDrive\\Desktop\\New folder (4)\\login.png");
	// copyfile-static method
	FileUtils.copyFile(screenshotAs, f);
	String str = "Java Programm";
	String output = "";
	for (int i = str.length() - 1; i >= 0; i--) {
	    char c = str.charAt(i);
	    output = output + c;
	}
	System.out.println(output);
	Map<Character,Integer> map = new LinkedHashMap<>();
	for(int i=0; i<str.length();i++) {
	    char c= str.charAt(i);
	    if (map.containsKey(c)) {
		int value = map.get(c);
		map.put(c, value+1);
	    }else {
		map.put(c, 1);
	    }
	}
	System.out.println(map);

    }

}
