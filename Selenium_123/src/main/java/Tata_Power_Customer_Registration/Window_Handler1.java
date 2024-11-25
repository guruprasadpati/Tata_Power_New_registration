package Tata_Power_Customer_Registration;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Window_Handler1 {
	
	public void switchToparentWindow(WebDriver driver) {
		Set<String> windows=driver.getWindowHandles();
		String[] arr=windows.toArray(new String[windows.size()]);
		driver.switchTo().window(arr[0]);
	}

	public void switchTochildWindow(WebDriver driver) {
		Set<String> windows=driver.getWindowHandles();
		String[] arr=windows.toArray(new String[windows.size()]);
		driver.switchTo().window(arr[1]);
		
	

}
	public void clos1_Window(WebDriver driver) {
		driver.close();
}
}
	
