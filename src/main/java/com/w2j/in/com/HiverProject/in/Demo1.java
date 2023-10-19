package com.w2j.in.com.HiverProject.in;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo1 {
public static void main(String[] args) {
	
	
	ChromeOptions opt=new ChromeOptions();
	opt.addExtensions(new File("./Extensions/Hiver.crx"));
	WebDriver driver=new ChromeDriver(opt);
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
}
}
