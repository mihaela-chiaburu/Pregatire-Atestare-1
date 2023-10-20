import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //------------------Conditions and Operators and Loops:
        //1. Write a Java program to determine if a given number is even or odd.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if(number%2==1)
            System.out.println("Odd number");
        else
            System.out.println("Even number");

        //2. Create a program that takes two numbers as input and finds the larger of the two.
        System.out.print("Enter two numbers: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        if(n1>n2)
            System.out.println(n1 + " is larger");
        else if (n1==n2)
            System.out.println("Numbers are equal");
        else
            System.out.println(n2 + " is larger");

        //3. Implement a simple calculator that can perform addition, subtraction, multiplication, and division
        int loop = 1;
        while(loop==1){
            System.out.print("Enter 2 numbers: ");
            int nr1 = scanner.nextInt();
            int nr2 = scanner.nextInt();
            System.out.println("Choose the operation: ");
            System.out.print(" + \n - \n * \n / \n");
            System.out.print("Operation: ");
            String op = scanner.next();
            if (!op.matches("[-+*/]"))
                continue;
            switch (op){
                case  "+":
                    int res = nr1 + nr2;
                    System.out.println(nr1 + " + " + nr2 + " = " + res);
                    break;
                case "-":
                    res = nr1 - nr2;
                    System.out.println(nr1 + " - " + nr2 + " = " + res);
                    break;
                case  "*":
                    res = nr1 * nr2;
                    System.out.println(nr1 + " * " + nr2 + " = " + res);
                    break;
                case  "/":
                    double rez = (double)nr1 / nr2;
                    System.out.println(nr1 + " / " + nr2 + " = " + rez);
                    break;
            }
            System.out.println("If u want to exit, enter 0 else 1");
            loop = scanner.nextInt();
            if (loop == 0)
                break;
        }

        //-------------------------- Arrays:
        //1. Find the sum of all elements in an integer array.
        int[] arr = new int[100];
        System.out.print("Enter the nr of elements in the array: ");
        int n = scanner.nextInt();
        System.out.print("Enter the elements of the array: ");
        int sum = 0;
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
            sum +=arr[i];
        }
        System.out.println("The sum of all the elements: " + sum);

        //2. Calculate the average of elements in a double array.
        double[] arr2 = {5.2, 4.6, 10.8, 7.6, 11.333, 7.0};
        double avg, sumD = 0;
        for (double v : arr2) {
            sumD += v;
        }

        System.out.println("\nThe average in the array {5.2, 4.6, 10.8, 7.6, 11.333, 7.0} is: " + sumD/ arr2.length);

        //3. Find the maximum and minimum values in an array.
        int[] arr3 = new int[25];
        System.out.print("Enter the nr of elements in the array: ");
        int n3= scanner.nextInt();
        System.out.print("Enter the elements of the array: ");
        arr3[0] = scanner.nextInt();
        int Max = arr3[0];
        int Min = arr3[0];
        for(int i=1; i<n; i++){
            arr3[i] = scanner.nextInt();
            if(arr[i]>Max)
                Max = arr3[i];
            if(arr3[i]<Min)
                Min = arr3[i];
        }
        System.out.println("Max element: " + Max);
        System.out.println("Min element: " + Min);

        //---------------------Exceptions:
        try {
            // Code that may throw an exception
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; // Division by zero will throw an ArithmeticException
            System.out.println("Result: " + result); // This line won't be executed
        } catch (ArithmeticException e) {
            // Code to handle the exception
            System.err.println("An error occurred: " + e.getMessage());
        }
        System.out.println("Program continues after the try-catch block.");

        //-------------------Lists:
        //1. Create an ArrayList of integers, add elements to it, and find the sum of all elements.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(0);
        int suma = 0;
        for(int e: numbers){
            suma += e;
        }
        System.out.println("ArrayList elements: " + numbers);
        System.out.println("Sum of elements: " + sum);

        //2. Create a List<String, add elements to it, and find the sum of all the elements' lengths
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("mama");
        words.add("dragon");
        int len = 0;
        for(String w: words){
            len += w.length();
        }
        System.out.println("List elements: " + words);
        System.out.println("Sum of lengths of elements: " + len);
    }
}