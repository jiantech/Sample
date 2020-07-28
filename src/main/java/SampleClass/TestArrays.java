package SampleClass;

public class TestArrays {
    public static void main(String[] args) {
        //datatype[] variablename = new datatype[SIZE];
        int[] intArray = new int[4]; // Initialization type 1
        intArray[0] = 20;
        intArray[1] = 40;
        intArray[2] = 50;
        intArray[3] = 100;

        for(int temp:intArray)
            System.out.println(temp);

        System.out.println("------------------");
        int[] intArray2 = {1,6,3,8,4,9}; // Initialization type 2
        for(int temp:intArray2)
            System.out.println(temp);

        System.out.println("length " + intArray.length);
        System.out.println("------------------");
        String[] stringArray = new String[2];
        stringArray[0] = "TurboJet";
        stringArray[1] = "TurboFan";
        for(int i=0; i< stringArray.length; i++)
            System.out.println(stringArray[i]);
    }
}
