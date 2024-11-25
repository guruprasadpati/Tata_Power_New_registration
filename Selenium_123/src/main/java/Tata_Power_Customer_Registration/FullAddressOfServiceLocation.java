package Tata_Power_Customer_Registration;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class FullAddressOfServiceLocation {
	@Test
	public void FASL(WebDriver driver,String SFNoORPlotNo,String Street,String ColonyArea,String MobileNo,String EmailId) throws Exception{ 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//Verify state of Correspondence Address checkbox
		WebElement CorrespondenceAddress=driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[2]"));
        boolean CheckboxCorrespondenceAddr= CorrespondenceAddress.isEnabled();
        if (CheckboxCorrespondenceAddr)
        	System.out.println("The check box is enabled");
        else 
        	System.out.println("The check box is disabled");
        //Retrive Checkbox name
        WebElement CheckboxNameCSAddress=driver.findElement(By.xpath("(//span[@class='mat-checkbox-label'])[2]"));
        System.out.println("CheckboxNameCSAddress:"+CheckboxNameCSAddress.getText());
        //Select the checkbox
        CheckboxNameCSAddress.click();
        //Verify SF No / Plot No
    	WebElement SFNoorPlotNo=driver.findElement(By.xpath("//input[@formcontrolname='sfPlotNo2' and @id='mat-input-11']"));
		String SFNoorPlotNoValue=SFNoorPlotNo.getAttribute("value");
		System.out.println("SF No/ Plot No:  " +  SFNoorPlotNoValue);
	   String ActualName = SFNoorPlotNoValue;
	   String ExpectedName =SFNoORPlotNo;
	   SoftAssert SFPL =new SoftAssert();
	   SFPL.assertEquals(ActualName, ExpectedName);
	   //Verify Street
	   WebElement Street1=driver.findElement(By.xpath("//input[@formcontrolname='streetName2' and @id='mat-input-12']"));
		String StreetValue=Street1.getAttribute("value");
		System.out.println("Street:  " +  StreetValue);
	   String ActualNameStreet = StreetValue;
	   String ExpectedNameStreet =Street;
	   SoftAssert ST =new SoftAssert();
	   ST.assertEquals(ActualNameStreet, ExpectedNameStreet);
	   //Verify Colony/Area
	   WebElement ColonyAR=driver.findElement(By.xpath("//input[@formcontrolname='colonyArea2' and @id='mat-input-13']"));
	 		String ColonyARValue=ColonyAR.getAttribute("value");
	 		System.out.println("ColonyArea:  " +  ColonyARValue);
	 	   String ActualNameColonyArea = ColonyARValue;
	 	   String ExpectedNameColonyArea =ColonyArea;
	 	   SoftAssert CRA =new SoftAssert();
	 	  CRA.assertEquals(ActualNameColonyArea, ExpectedNameColonyArea);
	 	  //Verify Mobile Phone
	 	   WebElement MobilePh=driver.findElement(By.xpath("//input[@formcontrolname='mobilePhone2' and @id='mat-input-14']"));
	 		String MobilePhoneValue=MobilePh.getAttribute("value");
	 		System.out.println("Mobile Phone:  " +  MobilePhoneValue);
	 	   String ActualNameMobilePhone = MobilePhoneValue;
	 	   String ExpectedNameMobilePhone =MobileNo;
	 	   SoftAssert Mph =new SoftAssert();
	 	  Mph.assertEquals(ActualNameMobilePhone, ExpectedNameMobilePhone);
	 	  //Verify Emailid
	 	  WebElement E_ID=driver.findElement(By.xpath("//input[@formcontrolname='emailId2' and @id='mat-input-17']"));
	 		String EmailIdValue=E_ID.getAttribute("value");
	 		System.out.println("EmailId:  " +  EmailIdValue);
	 	   String ActualNameEmail_Id = EmailIdValue;
	 	   String ExpectedNameEmail_Id =EmailId;
	 	   SoftAssert EID =new SoftAssert();
	 	  EID.assertEquals(ActualNameEmail_Id, ExpectedNameEmail_Id);
	 	  //Verify State for Nearest Landmark Checkmark
	 	 WebElement NearestLandmark =driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[3]"));
	        boolean CheckboxNearestLandmark= NearestLandmark.isEnabled();
	        if (CheckboxNearestLandmark)
	        	System.out.println("The check box is enabled");
	        else 
	        	System.out.println("The check box is disabled");
	        //Retrive Checkbox name
	        WebElement CheckboxNameNLandmark=driver.findElement(By.xpath("(//span[@class='mat-checkbox-label'])[3]"));
	        System.out.println("CheckboxNameNearest Landmark:"+CheckboxNameNLandmark.getText());
	        //Select the checkbox
	        CheckboxNameNLandmark.click();
	        //Select Near By Location from Landmark Type dropdown
	        Thread.sleep(10000);
	        WebElement landmarkType=driver.findElement(By.xpath("//div[@id='mat-select-value-49']/span"));
	        landmarkType.click();
		      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='mat-option-text'])[3]"))).click();
		      //Provide data under Near By Location
		      Thread.sleep(10000);
		      WebElement NearByLocation=driver.findElement(By.xpath("(//input[@formcontrolname='nearByLocation'])[1]"));
		      NearByLocation.sendKeys("DGH");
	        //Select & read next button
		      WebElement Nextbtn = driver.findElement(By.xpath("(//span[text()='Next'])[1]"));

		      System.out.println("Next button.isDisplayed()" + Nextbtn.isDisplayed());
		      System.out.println("Element with text(): " + Nextbtn.getText() );

		       if(Nextbtn.isDisplayed()==true) {


		      }else {

		      System.out.println("Option is not displayed");

		       }
		       Nextbtn.click();
		       //Select Ok button and retrive warning message
		       WebElement warningmsg = driver.findElement(By.xpath("//div[text()=' Please fill all the mandatory fields ']"));
		       System.out.println("warningmsg.isDisplayed()" + Nextbtn.isDisplayed());
		         System.out.println("Element with text(): " + warningmsg.getText() );
		         driver.findElement(By.xpath("//div[@class='ng-star-inserted' and @style='float: right;']")).click();
        Thread.sleep(300);
        Window_Handler1 wh=new Window_Handler1();
        wh.clos1_Window(driver);
        Thread.sleep(2000);
        wh.switchToparentWindow(driver);
        Back_To_Reg_Link b1=new Back_To_Reg_Link();
        b1.clickButton(driver);
        wh.switchTochildWindow(driver);
        Thread.sleep(2000);
  
}
}