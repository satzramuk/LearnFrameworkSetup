package com.learning.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderUtils {

	@DataProvider
	public Object[][] getData() throws IOException {

		//We are establishing an connection between excel and our code 
		FileInputStream fip = new FileInputStream("C:/Users/Sathish/git/LearnFrameworkSetup/LearnFrameworkSetup/src/test/resources/excelfiles/TestData.xlsx");
		//We are just passing the file reference to workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fip);
		XSSFSheet sheet = workbook.getSheet("testing");

		int lastRowNum = sheet.getLastRowNum();
		short lastColNum = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[lastRowNum][lastColNum];


		for (int i = 1; i <lastRowNum+1 ; i++) {

			for (int j = 0; j <lastColNum ; j++) {
				data[i-1][j]  = sheet.getRow(i).getCell(j).getStringCellValue();

			}

		}

		return data;

	}


	}
