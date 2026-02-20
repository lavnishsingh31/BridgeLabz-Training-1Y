package com.gla.methods.level1;

import java.util.Scanner;

class NumberChecker {

    public int checkNumber(int number) {
        if (number > 0)
            return 1;
        else if (number < 0)
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        NumberChecker obj = new NumberChecker();
        int result = obj.checkNumber(number);

        System.out.println("Result: " + result);
    }
}

