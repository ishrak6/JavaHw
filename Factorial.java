package FactorialC;

import java.util.Scanner;

public class Factorial {

    static int recFactorial(int n) {
        if (n >= 1) {
            return (n * recFactorial(n - 1));
        } else {
            return (1);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate Factorial: ");
        int num = sc.nextInt();
        int fact = 1;
        if (num <= 0) {
            fact = 1;
        } else {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println("\n Factorial of " + num + " using Non Recursive Method is:" + fact);
        }

        System.out.println("\n Factorial of " + num + " using Recursive Method is:" + recFactorial(num));
    }
}
