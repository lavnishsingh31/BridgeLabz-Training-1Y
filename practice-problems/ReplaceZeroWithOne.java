import java.util.Scanner;

public class ReplaceZeroWithOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        int result = replaceZeros(num);
        System.out.println("Result: " + result);
        
        sc.close();
    }
    
    public static int replaceZeros(int num) {
        if (num == 0) return 1;
        
        int newNum = 0;
        int power = 1;
        
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) {
                digit = 1;
            }
            newNum += digit * power;
            power *= 10;
            num /= 10;
        }
        return newNum;
    }
}