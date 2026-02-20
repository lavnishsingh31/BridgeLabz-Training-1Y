
import java.util.Scanner;

public class Solution1 {
    public static String[][] calculateBMI(double[][] data) {
        String[][] results = new String[data.length][4]; // Height, Weight, BMI, Status
        
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            
            String status;
            if (bmi <= 18.4) status = "Underweight";
            else if (bmi <= 24.9) status = "Normal";
            else if (bmi <= 39.9) status = "Overweight";
            else status = "Obese";
            
            results[i][0] = String.valueOf(heightCm);
            results[i][1] = String.valueOf(weight);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }
        return results;
    }
    
    public static void displayBMI(String[][] results) {
        System.out.println("Height\tWeight\tBMI\tStatus");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
        }
    }

    public static void main(String[] args) {
        // Solution 1: BMI
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2]; // Weight, Height
        
        System.out.println("Enter details for 10 persons (Weight in kg, Height in cm):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i+1) + ": ");
            data[i][0] = 50 + Math.random() * 50; // Random weight 50-100
            data[i][1] = 150 + Math.random() * 40; // Random height 150-190
            System.out.println(data[i][0] + " " + data[i][1]);
        }
        
        String[][] results = calculateBMI(data);
        displayBMI(results);
        sc.close();
    }
}
