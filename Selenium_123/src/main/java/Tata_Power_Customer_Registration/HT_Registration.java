package Tata_Power_Customer_Registration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Tata_Power_Electric.Connection_for_New_Residential_Customer.Window_Handler;
import Tata_Power_Electric.Connection_for_New_Residential_Customer.back_To_Tata_Power;

public class HT_Registration {
	@Test
	public void HTRC(WebDriver driver, String firstname, String surName, String fatherName) throws Exception{ 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//Verify label HT Registration
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='card-title']")));
		  WebElement HT_Reg = driver.findElement(By.xpath("//h4[@class='card-title']"));
		   System.out.println("Element with text(): " + HT_Reg.getText() );
		   Boolean HT_RegDisplay = driver.findElement(By.xpath("//h4[@class='card-title']")).isDisplayed();
		   System.out.println("HT Registration :"+HT_RegDisplay);

	//Select a value from Application Catagory
//		   driver.findElement(By.xpath("//div[@class='mat-select-value ng-tns-c53-2']")).click();
//		   WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(20));
//		   System.out.println("Pass");
//	  wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='mat-option-text'])[1]"))).click(); 
//      System.out.println("Sucess");
    //Provide Salutation
      driver.findElement(By.xpath("//div[@class='mat-select-value ng-tns-c53-72']")).click();
      WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(20));
      wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='mat-option-text'])[3]"))).click();
      //Provide FirstName
      driver.findElement(By.xpath("//input[@formcontrolname='applicantName' and @id='mat-input-39']")).sendKeys(firstname);
      //Provide LastName
      driver.findElement(By.xpath("//input[@formcontrolname='surName' and @id='mat-input-41']")).sendKeys(surName);
      ///Provide  Salutation
      driver.findElement(By.xpath("//div[@class='mat-select-value ng-tns-c53-88']")).click();
      WebDriverWait wait4 = new WebDriverWait(driver,Duration.ofSeconds(20));
      wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='mat-option-text'])[2]"))).click();
      //Provide FatherName
      driver.findElement(By.xpath("//input[@formcontrolname='fatherHusband' and @id='mat-input-42']")).sendKeys(fatherName);

      
	}
}

