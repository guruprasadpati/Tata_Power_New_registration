package Tata_Power_Customer_Registration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
	
	public class Read_ExcelFile {
		public void Read_ExcelFileFromUser(String file, WebDriver driver) throws Exception {
			// TODO Auto-generated method stub
			
			try {
				Read_ExcelFile RF=new Read_ExcelFile();
				HT_Registration htr= new HT_Registration();
				AddressOfServiceLocation aosl= new AddressOfServiceLocation();
				FullAddressOfServiceLocation faosl= new FullAddressOfServiceLocation();
				XSSFWorkbook work= new XSSFWorkbook(new FileInputStream(file));
				XSSFSheet sheet=work.getSheet("Sheet1");
				XSSFRow row;
				
				int i=1;
				while((row= sheet.getRow(i))!=null) {
					System.out.println("Firstname - "+ row.getCell(0).getStringCellValue());
					String Firstname=row.getCell(0).getStringCellValue();
					
					System.out.println("SurName - "+ row.getCell(1).getStringCellValue());
					String SurName=row.getCell(1).getStringCellValue();
					
					System.out.println("FatherName - "+ row.getCell(2).getStringCellValue());
					String FatherName=row.getCell(2).getStringCellValue();
					
					System.out.println("SFNo/PlotNo - "+ row.getCell(3).getStringCellValue());
					String SFNoORPlotNo=row.getCell(3).getStringCellValue();
					
					System.out.println("Street - "+ row.getCell(4).getStringCellValue());
					String Street=row.getCell(4).getStringCellValue();
					
					System.out.println("ColonyArea - "+ row.getCell(5).getStringCellValue());
					String ColonyArea=row.getCell(5).getStringCellValue();
					
					System.out.println("GST No - "+ row.getCell(6).getStringCellValue());
					String GSTNo=row.getCell(6).getStringCellValue();
					
					System.out.println("PAN Card Number - "+ row.getCell(7).getStringCellValue());
					String PANCardNumber=row.getCell(7).getStringCellValue();
					
					System.out.println("Email Id - "+ row.getCell(8).getStringCellValue());
					String EmailId=row.getCell(8).getStringCellValue();
					
					System.out.println("Mobile No - "+ row.getCell(9).getStringCellValue());
					String MobileNo=row.getCell(9).getStringCellValue();
					
					System.out.println("WatSap No - "+ row.getCell(10).getStringCellValue());
					String WatSapNo=row.getCell(10).getStringCellValue();
					
					htr.HTRC(driver, Firstname,SurName,FatherName);
					aosl.ASL(driver, SFNoORPlotNo,Street,ColonyArea,GSTNo,PANCardNumber,EmailId,MobileNo,WatSapNo);
					faosl.FASL(driver,SFNoORPlotNo,Street,ColonyArea,EmailId,MobileNo);
					i++;

					Thread.sleep(5000);

}
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	
			
		
	
	
