package sit707;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main 
{
    public static void main( String[] args )
    {
//        SeleniumOperations.officeworks_registration_page("https://www.officeworks.com.au/app/identity/create-account");
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VE\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();

    	
    	driver.get("https://www.google.com");
    	try {
    		Thread.sleep(5*1000);
    		
    	}catch(InterruptedException e){
    		e.printStackTrace();
    	}
    	
    	driver.close();
    }
}
