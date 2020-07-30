package SampleClass;

public class Recursion {

    public static void main(String[] args) {
        int value = new Recursion().generateNumber(0);
        System.out.println(value);
    }

    public int generateNumber(int n)
    {
        int g = n+1;
        if(g >= 20)
            return g;
        return generateNumber(g);// Same function called again
    }
}