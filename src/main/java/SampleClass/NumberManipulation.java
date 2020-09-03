package SampleClass;

import java.util.Scanner;

public class NumberManipulation {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the numbers");
        for(int i=0; i<n; i++)
        {
            array[i] = scanner.nextInt();
        }

        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(array[i] > array[j])
                {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        System.out.println();
        for(int i=0; i<n; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
