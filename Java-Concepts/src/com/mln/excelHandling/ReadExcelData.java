package com.mln.excelHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelData {


	@Test
	public void f() throws IOException {
		
	Object[][] data =  getExcelData();
	for (Object[] s : data){
		for(Object s1 : s){
			System.out.print(String.valueOf(s1) +" ");
		}
		System.out.println();
	}
		
	}



	public int getColValue(Sheet sheet,String SearchText) {
		DataFormatter formatter = new DataFormatter();
		int strColnum = 0;
		for (Row row : sheet) {
			for (Cell cell : row) {
				if (SearchText.equals(formatter.formatCellValue(cell))) {
					// text matches the string cell value,
					// so find the adjacent cell
					//Cell adjacentCell = row.getCell(cell.getColumnIndex() + 1);
					strColnum =  cell.getColumnIndex();
					return strColnum;

				}

				// search text not found

			}

		}
		return strColnum;

	}

	public String getCellValueString(Sheet sheet,int iRow, int iCol){
		String strCellValue = sheet.getRow(iRow).getCell(iCol).getStringCellValue();		
		return strCellValue ;

	}


	private Object[][] getExcelData() throws IOException{

		FileInputStream excelFile = new FileInputStream("C:/My Folder/Srinath/Learnings/Java/Java-Concepts/Java-Concepts/testExcel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(excelFile);
		XSSFSheet sheet = wb.getSheet("testSheet");
		int checkColIndex = getColValue(sheet,"ExecutionInclusion");


		int iRowCount=	sheet.getLastRowNum();
		int iColCount = sheet.getRow(iRowCount).getLastCellNum();
		int iActualRowCount =0;

		for (int iRow =1 ; iRow <iRowCount; iRow++){			
			String checkColValue = sheet.getRow(iRow).getCell(checkColIndex).getStringCellValue();
			if (checkColValue.equalsIgnoreCase("Y")){
				iActualRowCount++;
			}
		}
		Object[][] ExcelData = new Object[iActualRowCount][iColCount];
		int iRowNo=0;
		for (int iRow =1 ; iRow <iRowCount; iRow++){			
			String checkColValue = sheet.getRow(iRow).getCell(checkColIndex).getStringCellValue();
			if (checkColValue.equalsIgnoreCase("Y")){
					int iColNo =0;
					Iterator<Cell> cellIterator= sheet.getRow(iRow).iterator();
					//ExcelData[iRow-1][iCol] = sheet.getRow(iRow).getCell(iCol).getStringCellValue();
					if (iRow >0){
					while(cellIterator.hasNext()){
						ExcelData[iRowNo][iColNo] = cellIterator.next().toString();				
						iColNo++;
						
					}
					
					//System.out.println(ExcelData[iRow-1][iCol]);
					
			}
					iRowNo++;

		}
		
	}
		return ExcelData;
}
}
