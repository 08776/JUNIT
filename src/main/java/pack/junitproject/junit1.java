package pack.junitproject;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pack.junitproject.BaseClass;

public class junit1 extends pack.junitproject.BaseClass{
	@Test
	public void tc1() {
		System.out.println("TC1");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\ECLIPSE PROG\\junitproject\\driver\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://www.instagram.com/explore/");
	}
	@Test
	public void tc2() {
		System.out.println("TC2");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\ECLIPSE PROG\\junitproject\\driver\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://www.instagram.com/explore/");
	}
	@Test
	public void tc3() {
		System.out.println("TC3");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\ECLIPSE PROG\\junitproject\\driver\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://www.amazon.com/");
	}
	@Before
	public void startdate() {
		Date d=new Date();
		System.out.println(d);
		System.out.println("start");
	}
	@After
	public void end() {
		Date d=new Date();
		System.out.println(d);
		System.out.println("end");
	}
	@BeforeClass
	public static void before() {
		System.out.println("Launch Browser");
		launchbrowser();
	}
	@AfterClass
	public static void after() {
		System.out.println("close browser");
		closeentirebrowser();
	}

}
