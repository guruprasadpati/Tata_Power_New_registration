package Tata_Power_Customer_Registration;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Main_Class_Reg {

		private static final Read_ExcelFile RE = null;
@BeforeTest
		public static void main (String [] args) throws Exception {
			WebDriver driver=new ChromeDriver();
			//New Connection Class
			New_ConnectionForm tp=new New_ConnectionForm();
			tp.TataNC(driver);
			//Window Handler Class
			Set<String> windows=driver.getWindowHandles();
			String[] arr=windows.toArray(new String[windows.size()]);
			driver.switchTo().window(arr[1]);
//			Window_Handler WH=new Window_Handler();
//			WH.switchTochildWindow(driver);
			//HTRC Class
			Read_ExcelFile htr = new Read_ExcelFile();
			htr.Read_ExcelFileFromUser("C:\\Users\\PCON - HP1\\Desktop\\Excel\\TataPower_Reg.xlsx",driver);

			

}
}