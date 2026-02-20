package com.gla.methods.level1;

import java.util.Scanner;

class WindChillCalculator {

    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature +
                (0.4275 * temperature - 35.75) *
                        Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter wind speed: ");
        double windSpeed = sc.nextDouble();

        WindChillCalculator obj = new WindChillCalculator();
        double result = obj.calculateWindChill(temperature, windSpeed);

        System.out.println("Wind Chill Temperature: " + result);
    }
}

