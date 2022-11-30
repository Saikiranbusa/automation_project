package testng1;



import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcases {
	public static String url ="https://karnatakatourism.org/";
	WebDriver kiran;
	  ExtentHtmlReporter htmlReporter;
	    ExtentReports extent;
	    ExtentTest test;
	@BeforeTest
	public void BT()
	{
		htmlReporter = new ExtentHtmlReporter("extent.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
		WebDriverManager.chromedriver().setup();
		 kiran = new ChromeDriver();
		 kiran.get(url); 
		 kiran.manage().window().maximize();

}


	
	@Test //Contact
	public void test1()  throws InterruptedException {
	    test = extent.createTest("Checking the functionality of contact feature");
	    
		kiran.findElement(By.xpath("//*[@href='tel:+91-80-22352424']")).click();
		ArrayList<String> tabs = new ArrayList<String>(kiran.getWindowHandles());
		int i = tabs.size();
		System.out.println(i);
		kiran.switchTo().window(tabs.get(0));
		test.pass("you are in karnataka home page");
		Thread.sleep(3000);
		

	}
	@Test //eamil
	public void test2()  throws InterruptedException {
		  test = extent.createTest("Checking the functionality of eamil feature");
		kiran.findElement(By.xpath("//*[@style='color: #ffffff; font-size: 12px; line-height: 20px; font-weight: 400; padding: 7px 0 8px 0; display: inline-block;']")).click();
		ArrayList<String> tabs = new ArrayList<String>(kiran.getWindowHandles());
		int i = tabs.size();
		System.out.println(i);
		kiran.switchTo().window(tabs.get(0));
		test.pass("you are in karnataka email page");
		Thread.sleep(3000);
	
	
	}
	@Test //newsletters
	public void test3()  throws InterruptedException {
		 test = extent.createTest("Checking the functionality of newsletters feature");
		kiran.findElement(By.xpath("//*[@href=\"/newsletters/\"]")).click();
		ArrayList<String> tabs = new ArrayList<String>(kiran.getWindowHandles());
		int i = tabs.size();
		System.out.println(i);
		kiran.switchTo().window(tabs.get(0));
		test.pass("you are in karnataka newsletters page");
		Thread.sleep(5000);
	}
	@Test //Karnataka Tourism Logo
	public void test4()  throws InterruptedException {
		 test = extent.createTest("Checking the functionality of Karnataka Tourism Logo  feature");
		kiran.findElement(By.xpath("//*[@class=\"mkdf-light-logo\"]")).click();
		test.pass("you are in karnataka Tourism Logo page");
		Thread.sleep(5000);
	}
	@Test //twitter
	public void test5() throws InterruptedException {
		 test = extent.createTest("Checking the functionality of twitter feature");
		kiran.findElement(By.xpath("//*[@href=\"https://twitter.com/KarnatakaWorld\"]")).click();
		test.pass("you are in karnataka twitter page ");
		Thread.sleep(10000);
	}

	@Test // Instagram 
	public void test6() throws InterruptedException  {
		 test = extent.createTest("Checking the functionality of instagram feature");
		kiran.findElement(By.xpath("//*[@href=\"https://www.instagram.com/karnatakaworld/\"]")).click();
		kiran.findElement(By.xpath("//*[@href='tel:+91-80-22352424']")).click();
		ArrayList<String> tabs = new ArrayList<String>(kiran.getWindowHandles());
		int i = tabs.size();
		kiran.switchTo().window(tabs.get(0));
		test.pass("you are in karnataka instagram page ");
		
		Thread.sleep(5000);
	}
	
	
	@Test //youtube
	public void test7() throws InterruptedException {
		 test = extent.createTest("Checking the functionality of youtube feature");
		
		 kiran.findElement(By.xpath("//*[@href='https://www.youtube.com/channel/UCWG2rwsJMUmFGywx4itZciw?app=desktop']")).click();
		 kiran.findElement(By.xpath("//*[@href=\"https://www.instagram.com/karnatakaworld/\"]")).click();
			kiran.findElement(By.xpath("//*[@href='tel:+91-80-22352424']")).click();
			ArrayList<String> tabs = new ArrayList<String>(kiran.getWindowHandles());
			int i = tabs.size();
			kiran.switchTo().window(tabs.get(0));
			test.pass("you are in karnataka youtube page ");
		Thread.sleep(3000);
	}
	
	 @Test //travel tips
		public void test8() throws InterruptedException {
		 test = extent.createTest("Checking the functionality of travel tips feature");
		 JavascriptExecutor js = ((JavascriptExecutor)kiran);
			js.executeScript("window.scrollTo(0,8000)");
			Thread.sleep(5000);
		 kiran.findElement(By.xpath("//*[contains(text(),'Travel Tips')]")).click();
	 }



@Test // kttf
	public void test9() throws InterruptedException {
	 test = extent.createTest("Checking the functionality of kttp feature");
	 JavascriptExecutor js = ((JavascriptExecutor)kiran);
		js.executeScript("window.scrollTo(0,12000)");
		Thread.sleep(5000);
	 kiran.findElement(By.xpath("//li[@id='menu-item-118143']/a[1]")).click();
	 test.pass("you are in karnataka kttf page ");
	 Thread.sleep(5000);
}
    @AfterTest
    public void aftertest() {
    kiran.quit();
    test.info("you closed the browser");
    extent.flush();
}
}

