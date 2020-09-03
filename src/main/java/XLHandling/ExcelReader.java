package XLHandling;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader {
    private FileInputStream fis;
    private Workbook workbook;
    private Sheet sheet;

    public ExcelReader(String file)
    {
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet = workbook.getSheet("Personal Info");
    }

    public ExcelReader(InputStream inputStream)
    {
        try {
            workbook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet = workbook.getSheet("Personal Info");
    }

    public int maxRows()
    {
        return sheet.getLastRowNum() + 1;
    }

    public int maxColumns()
    {
        return sheet.getRow(0).getLastCellNum();
    }

    public String readRowData(int rowNo)
    {
        List<String> rowData = new ArrayList<>();
        Row row = sheet.getRow(rowNo);
        for(int i=0; i< maxColumns(); i++)
        {
            rowData.add(getCellData(row.getCell(i)));
        }
        return String.join(",",rowData);
    }

    public String columnData(int column)
    {
        List<String> columnData = new ArrayList<>();
        for(int i=0; i<maxRows(); i++)
        {
            columnData.add(getCellData(sheet.getRow(i).getCell(column)));
        }
        return String.join(",",columnData);
    }

    private String getCellData(Cell cell)
    {
        String temp = "";
        switch (cell.getCellType())
        {
            case STRING:
                temp = cell.getStringCellValue();
                break;
            case NUMERIC:
                temp = Double.toString(cell.getNumericCellValue());
                break;
            case BOOLEAN:
                temp = Boolean.toString(cell.getBooleanCellValue());
                break;
            case BLANK:
                break;
            default:
                System.out.println("Cannot handle " + cell.getCellType());
        }
        return temp;
    }

    public void writeRowData(List<String> data, String file)
    {
        if(fis != null) {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        int rowNo = maxRows();
        Row row = sheet.createRow(rowNo);
        for(int i=0; i< maxColumns(); i++) {
            row.createCell(i).setCellValue(data.get(i));
        }
        try {
            FileOutputStream fos = new FileOutputStream(file);
            workbook.write(fos);
            fos.close();
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
