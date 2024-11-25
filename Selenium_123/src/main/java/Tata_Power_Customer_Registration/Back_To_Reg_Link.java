package Tata_Power_Customer_Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Back_To_Reg_Link {
	public void clickButton(WebDriver driver) {
		driver.findElement(By.xpath("//aside[text()='CLICK TO REGISTER']")).click();
	}

}
