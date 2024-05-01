7.Armstrong numbers or not.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        int sum = 0, r, temp, digits = 0;
        temp = n;
        
        // Counting number of digits in the input number
        while (temp != 0) {
            temp = temp / 10;
            digits++;
        }
        
        temp = n; // Restoring the original number
        
        // Calculating Armstrong number sum
        while (temp > 0) {
            r = temp % 10;
            sum += Math.pow(r, digits);
            temp = temp / 10;
        }
        
        // Checking if the number is Armstrong or not
        if (sum == n) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
