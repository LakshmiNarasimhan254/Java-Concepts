package com.mln.excelHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReplace {
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
            for (Row row : sheet) {
                for (Cell cell : row) {
                    String originalValue = cell.getStringCellValue();
                    String replacementValue = getValueFromReplacementSheet(replacementSheet, originalValue);
                    if (replacementValue != null) {
                        cell.setCellValue(replacementValue);
                    }
                }
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

    private static String getValueFromReplacementSheet(Sheet replacementSheet, String originalValue) {
        for (Row row : replacementSheet) {
            String key = row.getCell(0).getStringCellValue();
            String value = row.getCell(1).getStringCellValue();
            if (key.equals(originalValue)) {

                return value;
            }
        }
        return null;
    }
}