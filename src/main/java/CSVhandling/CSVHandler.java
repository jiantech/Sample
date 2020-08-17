package CSVhandling;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVHandler {
    public static void main(String[] args) {
        String path = new CSVHandler().getClass().getClassLoader().getResource("sample.txt").getPath();
        File newFile = new File(new File(path).getParent() + "\\" + "sample.csv");

        /*String[] titles = {"name","age","location","state"};
        String[] data = {"Bharath","31","Parvathipuram","TN"};

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFile));
            System.out.println(String.join(",", titles));
            bufferedWriter.write(String.join(",", titles));
            bufferedWriter.newLine();
            bufferedWriter.write(String.join(",", data));
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try {
            List<DataHolder> dataHolderList = new ArrayList<>();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(newFile));
            String line = "";
            int count = 0;
            do{
                 line = bufferedReader.readLine();
                 if(count > 0 && line != null)
                 {
                     String[] data = line.split(",");
                     DataHolder dataHolder = new DataHolder();
                     dataHolder.setName(data[0]);
                     dataHolder.setAge(data[1]);
                     dataHolder.setLocation(data[2]);
                     dataHolder.setState(data[3]);
                     dataHolderList.add(dataHolder);
                 }
                 count++;
            }while (line != null);
            System.out.println(dataHolderList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
