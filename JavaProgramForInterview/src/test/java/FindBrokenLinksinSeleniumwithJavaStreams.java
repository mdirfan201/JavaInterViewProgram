

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLinksinSeleniumwithJavaStreams {
	
	static WebDriver driver;
	//public static void main(String[] args) {
		
	@Test
	public static  void FindBrokenLinks() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("No of Links are :: "+ links.size());
		List<String> urlList=new ArrayList<String>();
		
		for(WebElement e:links) {
			String url= e.getAttribute("href");
			urlList.add(url);
			//checkBrokenlink(url);
		}
		long stTime=System.currentTimeMillis();
		urlList.parallelStream().forEach(e-> checkBrokenlink(e)); 
		//Total Time taken: : 45468 = 45 sec
		//Total Time taken: : 37397 = 37 sec
	//	urlList.stream().forEach(e-> checkBrokenlink(e)); //Total Time taken: : 149634 =150 sec
		
		
		long endTime= System.currentTimeMillis();
		System.out.println("Total Time taken: : "+ (endTime-stTime));
		
		driver.quit();
		
	}
	
	public static void checkBrokenlink(String linkUrl) {
		
		try {
			URL url= new URL(linkUrl);
			HttpURLConnection httpUrlConnection =(HttpURLConnection) url.openConnection();
			httpUrlConnection.setConnectTimeout(5000);
			httpUrlConnection.connect();
			
			if(httpUrlConnection.getResponseCode()>=400) {
				System.out.println(linkUrl + "--> " + httpUrlConnection.getResponseMessage() + " is a broken Link" );
				
			}else {
				System.out.println(linkUrl + "--> " + httpUrlConnection.getResponseMessage());
			}
			
		} 
		
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
