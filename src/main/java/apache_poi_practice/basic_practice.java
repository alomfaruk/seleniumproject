package apache_poi_practice;

import java.util.Arrays;

import com.shams.excel.reader.utilities.Xlsx_Reeader_EAL;

public class basic_practice {

	public static void main(String[] args) {
		String exelfilepath="/Users/anikhassan/eclipse-workspace/seleniumproject/Testdata/facebookdata.xlsx";
		Xlsx_Reeader_EAL reader=new Xlsx_Reeader_EAL(exelfilepath);
		//how many rows
		
		int row= reader.getRowCount("fb");
		System.out.println(row);
       //how many column
		int column= reader.getColumnCount("fb");
		System.out.println(column);
		
		//get all data
		Object data[][] = reader.getSheetData("fb");
	System.out.println(Arrays.deepToString(data));
		
	}

}
