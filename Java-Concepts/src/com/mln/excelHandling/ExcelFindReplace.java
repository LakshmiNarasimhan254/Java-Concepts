package com.mln.excelHandling;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelFindReplace {
    public static void main(String[] args) {
        try {
// Load the source workbook
            FileInputStream sourceFile = new FileInputStream("source.xlsx");
            Workbook sourceWorkbook = new XSSFWorkbook(sourceFile);
            Sheet sheet = sourceWorkbook.getSheetAt(0);

// Load the replacement workbook
            FileInputStream replacementFile = new FileInputStream("replacement.xlsx");
            Workbook replacementWorkbook = new XSSFWorkbook(replacementFile);
            Sheet replacementSheet = replacementWorkbook.getSheetAt(0);

// Replace the values
            for (Row row : replacementSheet) {
                String key = row.getCell(0).getStringCellValue();
                String value = row.getCell(1).getStringCellValue();
                getValueToReplace(sheet, key, value);

            }

// Save the modified workbook
            FileOutputStream outputFile = new FileOutputStream("output.xlsx");
            sourceWorkbook.write(outputFile);

// Close the workbooks
            sourceWorkbook.close();
            replacementWorkbook.close();

            System.out.println("Done");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void getValueToReplace(Sheet sheet, String key, String value) {
        for (Row row : sheet) {
            for (Cell cell : row) {
                if (cell.getStringCellValue().contains(key)) {
                    String newValue = cell.getStringCellValue().replace(key, value);
                    cell.setCellValue(newValue);
                }
            }
        }

    }
}


// Replace the text

