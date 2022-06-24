package selenium;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import domain.Menu;

public class Selenium {
	private WebDriver driver;
	
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_RATH = "C:/workspace/devtools/chromedriver.exe";
	
	private String base_url;
	
	public Selenium() {
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_RATH);
		
		driver = new ChromeDriver();
		base_url = "http://localhost:8080/member/login";
		
	}
	@SuppressWarnings("serial")
	public void crawl() throws Exception {
		driver.get(base_url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("inadang");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("q1w2e3123");
		
		Thread.sleep(2000);
		
		String headLink = "http://localhost:8080/store/menu/11.json";
		
		driver.get(headLink);
		
		String jsonStr = driver.findElement(By.tagName("body")).getText();
		
		Gson gson = new Gson();
		
		Type type = new TypeToken<List<Menu>>(){}.getType();
		
		List<Menu> menus = gson.fromJson(jsonStr, type);
		
		for(Menu m : menus) {
			System.out.println(m.getName());
		}
		driver.close();
		
	}
	public static void main(String[] args) throws Exception {
		new Selenium().crawl();
		System.out.println("Hello");
	}
}
