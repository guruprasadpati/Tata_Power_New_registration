package Tata_Power_Customer_Registration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddressOfServiceLocation {
	@Test
	public void ASL(WebDriver driver, String sFNoORPlotNo, String street, String colonyArea, String gSTNo2, String pANCardNumber, String emailId2, String mobileNo2, String WatSapNo2) throws Exception{ 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//Provide SF No/Plot No
		driver.findElement(By.xpath("//input[@formcontrolname='sfPlotNo' and @id='mat-input-0']")).sendKeys(sFNoORPlotNo);
		//Provide Street
		driver.findElement(By.xpath("//input[@formcontrolname='streetName' and @id='mat-input-1']")).sendKeys(street);
		//Provide Colony/Area
		WebElement colonyOrArea=driver.findElement(By.xpath("//input[@formcontrolname='colonyArea' and @id='mat-input-2']"));
		colonyOrArea.sendKeys(colonyArea);
		//Get provided value of Colony/Area
		String colonyName=colonyOrArea.getAttribute("value");
		System.out.println("Colony Name:  " +  colonyName);
		//Provide Area Type
		driver.findElement(By.xpath("//div[@class='mat-select-value ng-tns-c53-9']")).click();
	      WebDriverWait waitAT = new WebDriverWait(driver,Duration.ofSeconds(20));
	      waitAT.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='mat-option-text'])[4]"))).click();
	      //Location type radio button
	      //Verify Location type radio button 
          WebElement LtrdRu=driver.findElement(By.xpath("(//span[@class='mat-radio-container'])[1]"));
          boolean radionbuttnEnabledRU= LtrdRu.isEnabled();
          if (radionbuttnEnabledRU)
          	System.out.println("The radio button is enabled");
          else 
          	System.out.println("The radio button is disabled");
          WebElement LtrdUR=driver.findElement(By.xpath("(//span[@class='mat-radio-container'])[2]"));
          boolean radionbuttnEnabledUR= LtrdUR.isEnabled();
          if (radionbuttnEnabledUR)
          	System.out.println("The radio button is enabled");
          else 
          	System.out.println("The radio button is disabled");
          //Provide GSTNo
          WebElement GSTNo=driver.findElement(By.xpath("//input[@formcontrolname='gstNo' and @id='mat-input-3']"));
          GSTNo.sendKeys(gSTNo2);
          //provide PAN Card No
          WebElement PANCardNo=driver.findElement(By.xpath("//input[@formcontrolname='panCardNumber' and @id='mat-input-4']"));
          PANCardNo.sendKeys(pANCardNumber);
          //DOB
          WebDriverWait DOB = new WebDriverWait(driver, Duration.ofSeconds(10));

          WebElement DOB1 = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]"));
          DOB1.click();
          driver.findElement(By.xpath("(//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])[21]")).click();
         //Get state for Opting E-Bill
          WebElement BillingAddress=driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[1]"));
          boolean CheckboxBillingAddr= BillingAddress.isEnabled();
          if (CheckboxBillingAddr)
          	System.out.println("The check box is enabled");
          else 
          	System.out.println("The check box is disabled");
          //Get Checkboxname
          WebElement CheckboxName=driver.findElement(By.xpath("(//span[@class='mat-checkbox-label'])[1]"));
          System.out.println("CheckboxName:"+CheckboxName.getText());
          //Select the checkbox
          driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[1]")).click();
          //Select Ok button for HT Registration
          driver.findElement(By.xpath("//div[@class='ng-star-inserted']/button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-warn']")).click();
          //Provide EmailId
          WebElement Emailid=driver.findElement(By.xpath("//input[@formcontrolname='emailId' and @id='mat-input-8']"));
          Emailid.sendKeys(emailId2);
        //Provide MobileNo
          WebElement MobileNo=driver.findElement(By.xpath("//input[@formcontrolname='mobilePhone' and @id='mat-input-9']"));
          MobileNo.sendKeys(mobileNo2);
        //Provide WatsappNo
          WebElement WatsappNo=driver.findElement(By.xpath("(//input[@formcontrolname='whatsapNumber'])[1]"));
          WatsappNo.sendKeys(WatSapNo2);
          //UploadPhoto
          if(emailId2.contains("xyz@gmail.com"))
          {
          Thread.sleep(300);
          String filepathreg= "C:\\Users\\PCON - HP1\\Desktop\\PPT\\suru.jpg";
          Thread.sleep(300);
          WebElement fileInputField_reg = driver.findElement(By.xpath("//input[@type='file' and @id='photo']"));
          fileInputField_reg.sendKeys(filepathreg);
          Thread.sleep(3000);
          }
          else if (emailId2.contains("abc@gmail.com")){
        	  Thread.sleep(300);
              String filepathreg1= "C:\\Users\\PCON - HP1\\Desktop\\PPT\\turu.jpg";
              Thread.sleep(300);
              WebElement fileInputField_reg1 = driver.findElement(By.xpath("//input[@type='file' and @id='photo']"));
              fileInputField_reg1.sendKeys(filepathreg1);
              Thread.sleep(3000);
          }
}

		
	}


	