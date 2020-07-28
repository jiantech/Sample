package SampleClass;

public class Conditional {
    public static void main(String[] args) {
        int a = 10;
        int b = 55;

        System.out.println(a>b);

        if(a > b)
            System.out.println(" A is greater than B");
        else
            System.out.println(" B is greater than A");

        if(a == b)
            System.out.println("Both A and B are same");
        else if(a > b)
            System.out.println("A is greater");
        else
            System.out.println("B is greater");

        String message = a > b?"A is greater":"B is greater";
        System.out.println(message);

    }
}
