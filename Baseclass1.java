package Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Baseclass1 {
	
	public static WebDriver driver;
	public static WebDriver getBrowser (String type) {
	if (type.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dinesh\\Desktop\\Sellunium\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if (type.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dinesh\\Desktop\\Sellunium\\Driver\\firefox.exe");
		driver=new FirefoxDriver();
		
		}
	return driver;
	
	

	}
	public static void geturl(String url) {
		driver.get(url);
		
	}
public static void maxi() {
	driver.manage().window().maximize();
}


public static  void impwait( int time) {
	driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	
	
	
}
public static void sleep1(int time) throws InterruptedException {
	Thread.sleep(time);
	

}




public static void women(WebElement ele) {
	Actions ac = new Actions(driver);
	ac.moveToElement(ele).build().perform();
	
	

}

public static void tshirtclick(WebElement ele) {
	ele.click();

}
public static  void sleep(int time1) throws InterruptedException {
 Thread.sleep(time1);

}
public static void search(WebElement ele, String input) throws AWTException {
	ele.sendKeys("input");
	Robot r=new Robot();
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);


}
public static void imgclick(WebElement ele) {
	ele.click();
	

}
public static void scroll(WebElement ele) {
	JavascriptExecutor  js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", ele);


}

public static void clearele(WebElement ele) {
	ele.clear();


}

public static void quantity(WebElement ele,int q) {
	ele.sendKeys("q");
	
}

public static void sizeclick(WebElement ele) throws AWTException {
	ele.click();
	Robot r=new Robot();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	

}

public static  void addtocartclick(WebElement ele) {
	ele.click();
	JavascriptExecutor  js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)");

}

public static void processedTo(WebElement ele) {
 ele.click();
 JavascriptExecutor  js = (JavascriptExecutor) driver;
 js.executeScript("window.scrollBy(0,000)");
	

}
public static  void proclick(WebElement ele) {
	ele.click();
	JavascriptExecutor  js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,400)");
}
public static void usernme(WebElement ele, String input ) {
	ele.sendKeys("input");

}
public static void Psskey(WebElement ele, String input ) {
	ele.sendKeys("input");
	
	
}
public static void login(WebElement ele) {
	ele.click();
	JavascriptExecutor  js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,600)");
	
	
}
public static void residencyClick(WebElement ele) {
	ele.click();
}
public static void agreecondition(WebElement ele) {
	ele.click();
	JavascriptExecutor  js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,600)");

	
}	
public static void checkoutclk(WebElement ele) {
	ele.click();
	JavascriptExecutor  js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,600)");
	
	
}

public static void pyment(WebElement ele) {
	ele.click();

	JavascriptExecutor  js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,600)");
	
}
public static void placeorderclk(WebElement ele) throws Throwable {
	ele.click();

	JavascriptExecutor  js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,600)");
	
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File Destination=new File("./minis/smin.png");
	FileUtils.copyFile(source, Destination);
	

}


}






