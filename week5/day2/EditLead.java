package week5.day2;

import java.io.IOException;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends ProjectSpecificMethods{

	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {		
		ExcelDataProvider data = new ExcelDataProvider();
		String[][] excelData = data.readExcelData("EditLead");
		return excelData;
	}
	
	@Test(dataProvider = "fetchData")
	public void editLead(String phone, String compName) throws InterruptedException {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phone);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys(compName);
		driver.findElementByName("submitButton").click();
	}
}






