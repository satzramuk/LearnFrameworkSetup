package com.learning.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderUtilsUsingMap {

	
	@DataProvider

	public Object[] getData1() throws IOException {

		//We are establishing an connection between excel and our code 
		FileInputStream fip = new FileInputStream(System.getProperty("C:/Users/Sathish/git/LearnFrameworkSetup/LearnFrameworkSetup/excelfiles/TestData.xlsx"));
		//We are just passing the file reference to workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fip);

		XSSFSheet sheet = workbook.getSheet("testing");

		int lastRowNum = sheet.getLastRowNum();
		short lastColNum = sheet.getRow(0).getLastCellNum();

		Map<String,String> map = null;

		List<Map<String,String>> list = new ArrayList<>();


		for (int i = 1; i <lastRowNum+1 ; i++) {

			map=new HashMap<>();
			for (int j = 0; j <lastColNum ; j++) {
				String key = sheet.getRow(0).getCell(j).getStringCellValue();
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				map.put(key, value);

			}

			list.add(map);


		}

		return list.toArray();



	}
}
