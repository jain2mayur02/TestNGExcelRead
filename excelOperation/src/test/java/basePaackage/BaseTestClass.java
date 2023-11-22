package basePaackage;

import java.lang.reflect.Method;
import java.util.Iterator;

import org.testng.annotations.DataProvider;

public class BaseTestClass {

	@DataProvider(name = "data1")
	public Iterator<Object[]> DataRead01(Method method) {
		return new BaseClass().readTestDataFromExcel("TestDataExcel.xlsx", "Sheet1", method.getName());
	}
	
	@DataProvider(name = "data2")
	public Iterator<Object[]> DataRead02(Method method) {
		return new BaseClass().readTestDataFromExcel("TestDataExcel.xlsx", "Sheet2", method.getName());
	}
}
