package XLHandling;

import java.util.ArrayList;
import java.util.List;

public class ExcelExecution {
    public static void main(String[] args) {
        String file = new ExcelExecution().getClass().getClassLoader().getResource("Test.xlsx").getFile();
        ExcelReader excelReader = new ExcelReader(file);
        System.out.println(excelReader.maxRows());
        System.out.println(excelReader.maxColumns());
        System.out.println(excelReader.readRowData(0));
        System.out.println(excelReader.columnData(2));

        List<String> data = new ArrayList<>();
        data.add("Shaji");
        data.add("30");
        data.add("02061990");
        data.add("KL");

        excelReader.writeRowData(data, file);
    }
}
