package SampleClass;

import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {
        System.out.println("Select the operation to be performed.\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. MultiplyUsingFor\n6. MultiplyUsingWhile");
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
                arithmeticOperations.subract(a,b);
                break;
            case 3:
                arithmeticOperations.multiply(a,b);
                break;
            case 4:
                arithmeticOperations.division(a,b);
                break;
            case 5:
                arithmeticOperations.multiplyUsingFor(a,b);
                break;
            case 6:
                arithmeticOperations.multiplyUsingWhile(a,b);
                break;
            default:
                System.out.println("Invalid operation. Retry!");
        }

    }

    private int multiply(int a, int b) {
        int temp = a*b;
        System.out.println("Result of multiplication " + b + " and " + a + " is " + temp);
        return temp;
    }

    private int multiplyUsingFor(int a, int b)
    {
        int value = 0;
        for (int i=1; i<=b; i++)
        {
            value = value + a;
        }
        System.out.println("Result of multiplication " + b + " and " + a + " is " + value);
        return value;
    }

    private int multiplyUsingWhile(int a, int b)
    {
        int value = 0;
        int count = 0;
        while(count < b)
        {
            value = value + a;
            count++;
        }
        System.out.println("Result of multiplication " + b + " and " + a + " is " + value);
        return  value;
    }

    private int division(int a, int b) {
        int temp = a/b;
        System.out.println("Result of division " + a + "/" + b + " is " + temp);
        return temp;
    }

    private int subract(int a, int b) {
        int temp = a-b;
        System.out.println("Result of subtraction " + b + " from " + a + " is " + temp);
        return temp;
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
