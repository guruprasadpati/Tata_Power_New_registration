package Tata_Power_Customer_Registration;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Assert;

public class New_ConnectionForm {
	
public void TataNC(WebDriver driver) throws Exception{ {
	
   driver.manage().window().maximize(); 
   driver.get("https://www.tpnodl.com/");
   //select close icon for pop-up
   driver.findElement(By.xpath("//button[@id='cboxClose']")).click();
   //Mouse Hover function at Home
   WebElement element = driver.findElement(By.cssSelector("#cd-primary-nav > li:nth-child(1) > a"));
   Thread.sleep(2000);
   Actions action = new Actions(driver);
   action.moveToElement(element).perform();
   Thread.sleep(5000);
   //Verify New Connection label
   WebElement NewConnection = driver.findElement(By.xpath("//h3[text()='New Connection']"));
   System.out.println("Element with NewConnection(): " + NewConnection.getText() );
   String ActualNameNewConnection = driver.findElement(By.xpath("//h3[text()='New Connection']")).getText().trim();
   String ExpectedNameNewConnection = driver.findElement(By.xpath("//h3[text()='New Connection']")).getText().trim();
   
   try {
   	assertEquals("New Connection", ExpectedNameNewConnection, ActualNameNewConnection);
   } catch (AssertionError error) {
       System.out.println("Not equal");
       throw error;
   }
   System.out.println("Equal");
   driver.findElement(By.xpath("//h3[text()='New Connection']")).click();
   //Select Do not forget to register yourself on our Consumer Portal
   WebElement CR = driver.findElement(By.xpath("//aside[text()='CLICK TO REGISTER']"));
   System.out.println("Element with text(): " + CR.getText() );
   Boolean CRtestDisplay = driver.findElement(By.xpath("//aside[text()='CLICK TO REGISTER']")).isDisplayed();
   System.out.println("CLICK TO REGISTER :"+CRtestDisplay);
   CR.click();
   
   }
  
}
}


