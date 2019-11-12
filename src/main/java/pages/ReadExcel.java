package pages;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String[][] readData(String fileName) throws IOException {
		XSSFWorkbook workbook=new XSSFWorkbook("src/main/java/utils/"+fileName+".xlsx");
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowNum=sheet.getLastRowNum();
		int colNum=sheet.getRow(0).getLastCellNum();
		String[][] data=new String[rowNum][colNum];
		for(int i=1;i<=rowNum;i++) {
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<colNum;j++) {
				XSSFCell cell=row.getCell(j);
				data[i-1][j]=cell.getStringCellValue();
			
				
			}
			
			
		}
		workbook.close();
		return data;
	}

}
