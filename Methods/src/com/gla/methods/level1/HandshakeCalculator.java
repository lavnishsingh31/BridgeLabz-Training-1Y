package com.gla.methods.level1;

import java.util.Scanner;

class HandshakeCalculator {

    public int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        HandshakeCalculator obj = new HandshakeCalculator();
        int handshakes = obj.calculateHandshakes(numberOfStudents);

        System.out.println("Maximum number of handshakes: " + handshakes);
    }
}
