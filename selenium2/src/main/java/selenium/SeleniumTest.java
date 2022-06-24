package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	private WebDriver driver;
	
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_RATH = "C:/workspace/devtools/chromedriver.exe";
	
	private String base_url;
	
	public SeleniumTest() {
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_RATH);
		
		driver = new ChromeDriver();
		base_url = "http://localhost:8080/member/notice";
	}
	
	public static void main(String[] args) throws InterruptedException {
        SeleniumTest test = new SeleniumTest();
        test.crawl();
    }

    public void crawl() throws InterruptedException{
    	driver.get(base_url);
    /*	element = driver.findElement(By.className("btn-book"));
        element.click();
        Thread.sleep(2000);

        driver.findElement(By.name("username")).sendKeys("inadang");
        driver.findElement(By.name("password")).sendKeys("q1w2e3123");
        element = driver.findElement(By.xpath("//*[@id="send_btn"]"));
        element.click();
        Thread.sleep(2000);
        */

    }
    static By select(String selector) {
        return By.cssSelector(selector);
    }	
	
	
}
