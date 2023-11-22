package excelTests;

import java.util.Map;

import org.testng.annotations.Test;

import basePaackage.BaseTestClass;
import excelPages.ExcelPage1;

public class ExcelTest01 extends BaseTestClass {
	
	@Test(priority = 1, dataProvider = "data1")
	public void getExcelDataTest01(Map<String, String> data) {
		ExcelPage1 excelPage01 = new ExcelPage1();
		excelPage01.getExcelCellData(data.get("Email"), data.get("Password"), data.get("Name"));
	}
	
	@Test(priority = 2, dataProvider = "data2")
	public void getExcelDataTest02(Map<String, String> data) {
		ExcelPage1 excelPage01 = new ExcelPage1();
		excelPage01.getExcelCellData(data.get("Email"), data.get("Password"), data.get("Name"));
	}
	
	

}
