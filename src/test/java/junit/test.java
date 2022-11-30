package junit;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	public static String url ="https://karnatakatourism.org/";
	WebDriver kiran;
	@Before
	public void BT()
	{
		WebDriverManager.chromedriver().setup();
		 kiran = new ChromeDriver();
		 kiran.get(url); 
		 kiran.manage().window().maximize();

}


	
	@Test //Contact
	public void test1()  throws InterruptedException {

		kiran.findElement(By.xpath("//*[@href='tel:+91-80-22352424']")).click();
		ArrayList<String> tabs = new ArrayList<String>(kiran.getWindowHandles());
		int i = tabs.size();
		System.out.println(i);
		kiran.switchTo().window(tabs.get(0));
		Thread.sleep(3000);
		

	}
	@Test 
	public void test2()  throws InterruptedException {

		kiran.findElement(By.xpath("//*[@style='color: #ffffff; font-size: 12px; line-height: 20px; font-weight: 400; padding: 7px 0 8px 0; display: inline-block;']")).click();
		ArrayList<String> tabs = new ArrayList<String>(kiran.getWindowHandles());
		int i = tabs.size();
		System.out.println(i);
		kiran.switchTo().window(tabs.get(0));
		Thread.sleep(3000);
	
	
	}
	@Test //newsletters
	public void test3()  throws InterruptedException {
		kiran.findElement(By.xpath("//*[@href=\"/newsletters/\"]")).click();
		ArrayList<String> tabs = new ArrayList<String>(kiran.getWindowHandles());
		int i = tabs.size();
		System.out.println(i);
		kiran.switchTo().window(tabs.get(0));
//		kiran.navigate().back();
//		kiran.navigate().refresh();
		Thread.sleep(5000);
	}
	@Test //Karnataka Tourism Logo
	public void test4()  throws InterruptedException {
		kiran.findElement(By.xpath("//*[@class=\"mkdf-light-logo\"]")).click();
		Thread.sleep(5000);
	}
	@Test //twitter
	public void test5() throws InterruptedException {
		kiran.findElement(By.xpath("//*[@href=\"https://twitter.com/KarnatakaWorld\"]")).click();
		Thread.sleep(10000);
	}

	@Test // Instagram 
	public void test6() throws InterruptedException  {
		kiran.findElement(By.xpath("//*[@href=\"https://www.instagram.com/karnatakaworld/\"]")).click();
		kiran.findElement(By.xpath("//*[@href='tel:+91-80-22352424']")).click();
		ArrayList<String> tabs = new ArrayList<String>(kiran.getWindowHandles());
		int i = tabs.size();
		kiran.switchTo().window(tabs.get(0));
		
		Thread.sleep(5000);
	}
	
	
	@Test //youtube
	public void test7() throws InterruptedException {
		
		 kiran.findElement(By.xpath("//*[@href='https://www.youtube.com/channel/UCWG2rwsJMUmFGywx4itZciw?app=desktop']")).click();
		 kiran.findElement(By.xpath("//*[@href=\"https://www.instagram.com/karnatakaworld/\"]")).click();
			kiran.findElement(By.xpath("//*[@href='tel:+91-80-22352424']")).click();
			ArrayList<String> tabs = new ArrayList<String>(kiran.getWindowHandles());
			int i = tabs.size();
			kiran.switchTo().window(tabs.get(0));
		Thread.sleep(3000);
	}
	
	 @Test
		public void test8() throws InterruptedException {
		 JavascriptExecutor js = ((JavascriptExecutor)kiran);
			js.executeScript("window.scrollTo(0,8000)");
			Thread.sleep(5000);
		 kiran.findElement(By.xpath("//*[contains(text(),'Travel Tips')]")).click();
	 }



@Test
	public void test9() throws InterruptedException {
	 JavascriptExecutor js = ((JavascriptExecutor)kiran);
		js.executeScript("window.scrollTo(0,12000)");
		Thread.sleep(5000);
	 kiran.findElement(By.xpath("//li[@id='menu-item-118143']/a[1]")).click();
}
	
}



