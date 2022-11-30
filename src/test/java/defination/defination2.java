package defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class defination2 {
	
	public static String url="https://karnatakatourism.org/";
	WebDriver kiran;

	@Given("user should on home page")
	public void user_should_on_home_page() {
		WebDriverManager.chromedriver().setup();
	  kiran = new ChromeDriver();
		kiran.get(url);
	}
	@Given("click on language dropdown")
	public void click_on_language_dropdown() {
		kiran.findElement(By.xpath("//*[@name='lang_choice_polylang-9']")).click();
	  
	}
	@Given("select English language")
	public void select_english_language() throws InterruptedException  {
		Select s= new Select(kiran.findElement(By.xpath("//*[@name='lang_choice_polylang-9']")));
		s.selectByIndex(0);
		
		Thread.sleep(5000);
		
	   kiran.close();
	}
	
}
