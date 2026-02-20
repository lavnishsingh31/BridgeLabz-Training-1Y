package com.gla.methods.level1;

import java.util.Scanner;

class NaturalNumberSum {

    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        NaturalNumberSum obj = new NaturalNumberSum();
        int result = obj.calculateSum(n);

        System.out.println("Sum of first " + n + " natural numbers: " + result);
    }
}
