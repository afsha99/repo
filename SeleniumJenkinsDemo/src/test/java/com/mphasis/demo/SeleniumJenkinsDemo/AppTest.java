package com.mphasis.demo.SeleniumJenkinsDemo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private WebDriver driver;
    private String url;
    private String expectedTitle;
     
    @BeforeMethod
    public void before()
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe") ;  
    	driver=new ChromeDriver();
    	url="http://google.com";
    	driver.navigate().to(url);
    }
    	
    	
    	
    	@Test
    public void shouldAnswerWithTrue()
    {
       String actualtitle=driver.getTitle();
       assertEquals(actualtitle,expectedTitle);
    }
    	@AfterMethod
    	public void closeBrowser()
    	{
    	driver.close();
}
}


