package mcs.service.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.record.CFRuleRecord.ComparisonOperator;
import org.apache.poi.hssf.record.cf.PatternFormatting;
import org.apache.poi.ss.usermodel.ConditionalFormattingRule;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.SheetConditionalFormatting;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POTest {
	public static void main(String args[]){ 
	
	
	       
	    //Get the workbook instance for XLS file 
	    XSSFWorkbook  workbook = new XSSFWorkbook ();
	 
	    //Get first sheet from the workbook
	    XSSFSheet  sheet = workbook.createSheet("Sample sheet");
	       Map<String, Object[]> data = new HashMap<String, Object[]>();
	    data.put("1", new Object[] {"Emp No.", "Name", "Salary"});
	    data.put("2", new Object[] {1d, "John", 1500000d});
	    data.put("3", new Object[] {2d, "Sam", 800000d});
	    data.put("4", new Object[] {3d, "Dean", 700000d});
	     
	    sheet.createRow(0).createCell(0).setCellValue(84);
	    sheet.createRow(1).createCell(0).setCellValue(74);
	    sheet.createRow(2).createCell(0).setCellValue(50);
	    sheet.createRow(3).createCell(0).setCellValue(51);
	    sheet.createRow(4).createCell(0).setCellValue(49);
	    sheet.createRow(5).createCell(0).setCellValue(41);
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
	 /*   sheet.createRow(5).createCell(0).setCellValue(simpleDateFormat.format(someService.getDate()));*/
	    SheetConditionalFormatting sheetCF = sheet.getSheetConditionalFormatting();
/*	    
	    ellStyle.setDataFormat(
	    	    createHelper.createDataFormat().getFormat("m/d/yy h:mm"));
*/	 
	    //Condition 1: Cell Value Is   greater than  70   (Blue Fill)
	    ConditionalFormattingRule rule1 = sheetCF.createConditionalFormattingRule(ComparisonOperator.GT, "70");
	    org.apache.poi.ss.usermodel.PatternFormatting fill1 = rule1.createPatternFormatting();
	    fill1.setFillBackgroundColor(IndexedColors.BLUE.index);
	    fill1.setFillPattern(PatternFormatting.SOLID_FOREGROUND);
	 
	    //Condition 2: Cell Value Is  less than      50   (Green Fill)
	    ConditionalFormattingRule rule2 = sheetCF.createConditionalFormattingRule(ComparisonOperator.LT, "50");
	    org.apache.poi.ss.usermodel.PatternFormatting fill2 = rule2.createPatternFormatting();
	    fill2.setFillBackgroundColor(IndexedColors.GREEN.index);
	    fill2.setFillPattern(PatternFormatting.SOLID_FOREGROUND);
	 
	    CellRangeAddress[] regions = {
	            CellRangeAddress.valueOf("A1:A6")
	    };
	   
	    sheetCF.addConditionalFormatting(regions, rule1, rule2);
	    try {
	        FileOutputStream out = 
	                new FileOutputStream(new File("D:\\new1.xlsx"));
	        workbook.write(out);
	        out.close();
	        System.out.println("Excel written successfully..");
	         
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	}
	
}
