package filehandling;

import java.io.*;
import java.net.URL;
import java.util.Arrays;

public class TestFileHandler {
    public static void main(String[] args) {
        String path = "";
        try {
            TestFileHandler tf = new TestFileHandler();
            path = tf.getClass().getClassLoader().getResource("sample.txt").getPath();
        }
        catch(Exception e)
        {
            System.out.println("Eror");
        }
        File file = new File(path);
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        file.length();
        //System.out.println(file.delete());

        String folder = file.getParent();
        folder = folder + "\\" + "images";
        File imagesFolder = new File(folder);
        if(!imagesFolder.exists()) {
            imagesFolder.mkdir();
            System.out.println("Folder created");
        }

        System.out.println(imagesFolder.isDirectory());
        System.out.println(file.isDirectory());
        System.out.println(imagesFolder.isFile());
        System.out.println(file.isFile());

        System.out.println(Arrays.asList(imagesFolder.list()).toString());


        try {
            char[] buffer = new char[256];
            FileReader reader = new FileReader(file);
            reader.read(buffer);
            System.out.println(buffer);
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String text = "";
            do{
                text = bufferedReader.readLine();
                if(text != null)
                    System.out.println(text);
            }while(text != null);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            String writeText = "Apple is red.";
            bufferedWriter.write(writeText);
            String appendText = "Apple a day keeps doctor away";
            bufferedWriter.append(appendText);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
