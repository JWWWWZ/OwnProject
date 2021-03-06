package Excel;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2019/11/22 0022
 * @author jiangwenzhu
 * @version 1.0
 */

public class PoiTest {


	public static void main(String[] args) throws IOException {

		long startTime = System.currentTimeMillis();
		System.out.println("---startTime----" +  startTime);

		FileOutputStream out = new FileOutputStream("e:\\test.xls");

		HSSFWorkbook wb = new HSSFWorkbook();

		HSSFSheet sheet = wb.createSheet();

		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HorizontalAlignment.CENTER);
		style.setVerticalAlignment(VerticalAlignment.CENTER);

//		for(int i = 0 ; i < 65535 ; i++){
//
//			HSSFRow row = sheet.createRow(i);
//
//			HSSFCell cell = row.createCell(0);
//
//			cell.setCellValue("hello world");
//
//			cell.setCellStyle(style);
//		}

		HSSFRow row = sheet.createRow(0);

		HSSFCell cell = row.createCell(0);

		cell.setCellValue("金牛区");

		cell.setCellStyle(style);

		HSSFRow row1 = sheet.createRow(1);

		HSSFCell cell1 = row1.createCell(0);

		cell1.setCellValue("高新区");

		cell1.setCellStyle(style);

		HSSFRow row2 = sheet.createRow(2);

		HSSFCell cell2 = row2.createCell(0);

		cell2.setCellValue("金牛区");

		cell2.setCellStyle(style);

		HSSFRow row3 = sheet.createRow(3);

		HSSFCell cell3 = row3.createCell(0);

		cell3.setCellValue("高新区");

		cell3.setCellStyle(style);


//		CellRangeAddress region = new CellRangeAddress(0, 10, 0, 0);
//
//		sheet.addMergedRegion(region);

		wb.write(out);

		long endTime = System.currentTimeMillis();

		System.out.println("---end  Time----" + endTime);


		System.out.println("---spendTime---" + (endTime - startTime));
	}


}
