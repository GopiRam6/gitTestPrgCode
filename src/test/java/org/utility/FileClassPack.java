package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class FileClassPack {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Gopi_Ram\\eclipse-workspace\\FrameWorkProject\\target\\File\\emp_details.xlsx");
		FileInputStream finput = new FileInputStream(f);
		Workbook workbook = new XSSFWorkbook(finput);
		Sheet sheet = workbook.getSheet("det");
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
		{
			Row row = sheet.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++)
			{
				Cell cell = row.getCell(j);
				//String s =cell.toString();
				int tt =cell.getCellType();
				System.out.println(tt);
			}
		}
		
		
	
		
	}
	
	
	
	

}
