package SampleClass;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        String test = "Apple is red";
        System.out.println(test);
        System.out.println(test.charAt(3));
        System.out.println(test.compareTo("Apple"));
        test = test.concat(", And sky is blue");
        System.out.println(test);
        System.out.println("Orange".equals("Orange"));
        String orange = "Orange";
        System.out.println(orange + " is sour");
        System.out.println(orange.equalsIgnoreCase("orange"));
        System.out.println(test.indexOf("is"));
        System.out.println(test.isEmpty());
        System.out.println(test.contains("sky"));
        System.out.println(test.lastIndexOf("is"));
        System.out.println(test.endsWith("blue"));
        System.out.println(test.startsWith("apple"));
        System.out.println(test.replace("sky", "ocean"));
        System.out.println(test.replaceAll("is", "IS"));
        System.out.println(orange.length());
        System.out.println(Arrays.asList("A-B-C-D-E".split("-")).toString());
        System.out.println(test.substring(test.indexOf(",") + 2));
        System.out.println(test.substring(test.indexOf("red"), test.indexOf("red") + 3));
        String trimmable = "test ";
        System.out.println("No trimmed " + trimmable);
        System.out.println("trimmed " + trimmable.trim());
        char[] chars =  test.toCharArray();
        System.out.println(chars);
        System.out.println(test.toLowerCase());
        System.out.println(test.toUpperCase());

        String[] array = {"apple","orange","grapes","rambutan"};
        String temp = String.join("-", array);
        System.out.println(temp);
    }
}
