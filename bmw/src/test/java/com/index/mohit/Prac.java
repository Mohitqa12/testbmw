package com.index.mohit;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Prac {

public static void main(String[] args) throws IOException
{

FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\TestReports.xls");
HSSFWorkbook wb = new HSSFWorkbook(fis);

int sheets=wb.getNumberOfSheets();//3

for(int i =0;i<sheets;i++)
{
HSSFSheet sheet=wb.getSheetAt(i);
if( sheet.getSheetName().equalsIgnoreCase("testdata"))
{

Iterator<Row> rows=sheet.iterator();//sheet is a collection of Row
Row firstrow=rows.next();
Iterator<Cell> ce=firstrow.cellIterator();//Row is a collection of cell
Cell value=ce.next();

int k=0;
int column =0;
while(ce.hasNext())
{
Cell value=ce.next();
if(value.getStringCellValue().equalsIgnoreCase("password"))
{
column =k;
}
k++;
}
System.out.println(column);


}

 
}
}

}

}
