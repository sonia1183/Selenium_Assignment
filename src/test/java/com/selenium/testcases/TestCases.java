package com.selenium.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases {
	
	WebDriver driver;
	String Status = "failed";
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority=1,description="Bajaj Test Case")
	public void BajajTestCase() {
		
		
       		 //visit google
		
		
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
        
        	//search Bajaj Finserv Health Limited
		
		
        driver.findElement(By.cssSelector("input.gLFyf")).sendKeys("Bajaj Finserv Health Limited"+Keys.ENTER);
		
		
       
      		 //visit https://www.bajajfinservhealth.in/
		
		
        driver.findElement(By.cssSelector("a[href*='https://www.bajajfinservhealth.in/']")).click();
		
		
       
         	//Search Doctors
		
		
         driver.findElement(By.cssSelector("#searchBarInput")).sendKeys("Doctors"+Keys.ENTER);
        //driver.findElement(By.cssSelector("div.css-dgynh5 > div:nth-child(5) > div.css-1lwfv71 > div > div.css-1q66mfy > div.css-apwxfg > div > div:nth-child(1) > div > a > div.css-14hwr1e > div.css-5glxer > div.css-1a5hr2q")).click();
        driver.findElement(By.cssSelector("#__next > div.css-dgynh5 > div:nth-child(5) > div.css-1lwfv71 > div > div.css-1q66mfy > div.css-apwxfg > div > div:nth-child(1) > a > div")).click();
         
		
		
        	//click slot and move check page
		
		
        driver.findElement(By.cssSelector("div.MuiGrid-container > div:nth-child(2) > div.MuiPaper-root > div.MuiCardContent-root > div.flex-column > div:nth-child(2) > div:nth-child(1) > div.slotTimeContainer > a:nth-child(1)")).click();
        //driver.findElement(By.cssSelector("#__next > div.css-h2q09c > div > div:nth-child(5) > div.docProfileContainer > section:nth-child(3) > div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-3 > div:nth-child(2) > div > div.MuiCardContent-root.css-145j55m > div.flex-column > div:nth-child(2) > div:nth-child(3) > div.slotTimeContainer > a:nth-child(2) > button > span.MuiButton-label")).click(); 
        //driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[5]/div[1]/section[1]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/div[2]/a[1]")).click();
		
		
        driver.close();
	}
	
	@Test(priority=2,description="Amazon Test Case")
	public void AmazonTestCase() {
	
		//visit amazon page
		
		
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//signin 
        
        driver.findElement(By.cssSelector("span#nav-link-accountList-nav-line-1")).click();
        
        String userName="6239518279";
        String password="sonia@123";
        driver.findElement(By.cssSelector("input#ap_email")).sendKeys(userName);
        driver.findElement(By.cssSelector("input#continue")).click();
        
        driver.findElement(By.cssSelector("input#ap_password")).sendKeys(password);
        driver.findElement(By.cssSelector("input#signInSubmit")).click();
		
		
		//dropdown and search iphone 12 but iphone is not available that's why it's not add to cart
		//so i take samsung galaxy 
        
        Select items = new Select(driver.findElement(By.id("searchDropdownBox")));
        items.selectByVisibleText("Electronics");
        
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung galaxy"+ Keys.ENTER);
        
        //driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
        //OUT OF STOCK :(
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
        
		
		//Add cart and check cart 
		
		
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        driver.findElement(By.cssSelector("span#attach-sidesheet-view-cart-button > span > input")).click();
        
        //driver.findElement(By.cssSelector("div#sc-item-Cc33a75f7-6e39-4949-ad20-f8aa156d1242 > div.sc-list-item-content > div > div.a-column.a-span10 > div > div > div.a-fixed-left-grid-col.a-col-right > div.a-row.sc-action-links > span.a-size-small.sc-action-delete > span > input"));
        driver.close();
	}

}

