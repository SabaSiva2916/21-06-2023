package org.browser;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

    public static void main(String[] args) {

	String s = "12ad34de56";
	int sum = 0;
	String temp = "0";
	for (int i = 0; i < s.length(); i++) {
	    char c = s.charAt(i);

	    if (Character.isDigit(c)) {

		temp = temp + c;
	    } else {
		int parseInt = Integer.parseInt(temp);
		sum = sum + parseInt;

		temp = "0";
	    }
	}
	int parseInt = Integer.parseInt(temp);
	sum = sum + parseInt;

	System.out.println(sum);
    }

}
