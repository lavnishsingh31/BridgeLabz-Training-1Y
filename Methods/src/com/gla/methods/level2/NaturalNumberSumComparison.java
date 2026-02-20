package com.gla.methods.level2;

import java.util.Scanner;

class NaturalNumberSumComparison {

    public static int sumUsingRecursion(int n) {
        if (n == 0)
            return 0;
        return n + sumUsingRecursion(n - 1);
    }

    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int sum1 = sumUsingRecursion(n);
        int sum2 = sumUsingFormula(n);

        System.out.println("Sum using recursion: " + sum1);
        System.out.println("Sum using formula: " + sum2);
    }
}

