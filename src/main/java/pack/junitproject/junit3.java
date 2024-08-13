package pack.junitproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class junit3 extends BaseClass  {
	public static void main(String[]args)
	{
		pack.junitproject.BaseClass.launchbrowser();
		junit2 j=new junit2();
		passtext("velmurugan@0903", j.getEmail());
		passtext("elango@0903", j.getPassword());
		drive.navigate().refresh();
		passtext("VELMURUGAN@0903", j.getEmail());
		passtext("ELANGO@0903", j.getPassword());
	}

}
