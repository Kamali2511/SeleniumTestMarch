package org.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.dri","C:\\Users\\Home\\Downloads\\geckodriver-v0.32.2-win-aarch64");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com/");
	}

}
