package SampleClass;

import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {
        System.out.println("Select the operation to be performed.\n1. Addition\n2. Subtraction");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();

        System.out.println("Enter the two numbers one after the other.\nEnter the first number.");
        int a = scanner.nextInt();
        System.out.println("Enter the second number.");
        int b = scanner.nextInt();

        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

        switch (operation)
        {
            case 1:
                arithmeticOperations.add(a,b);
                break;
            case 2:
                break;
        }

    }


    public int add(int A, int B)
    {
        int temp = A + B;
        System.out.println("Result of adding " + A +  " and " + B + " is " + temp);
        return temp;
    }

    // Subtraction

    // Multiplication

    //Division

    //Modulus

    // Percentage

}
