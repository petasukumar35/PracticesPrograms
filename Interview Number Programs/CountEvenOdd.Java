// Write a Program to Count Number of Even and Odd Digits in a Number.
// Input: 1234
// Output: Even Numbers:2
// Odd Numbers: 2

public class Main {
    public static void main(String[] args) {
        int number = 12345;
        
        int evenCount = 0;
        int oddCount = 0;
        
        while (number != 0) {
            int digit = number % 10;  // Extract the last digit
            
            if (digit % 2 == 0) {
                evenCount++;  // Increment even counter if the digit is even
            } else {
                oddCount++;  // Increment odd counter if the digit is odd
            }
            number = number / 10;  // Remove the last digit
        }
        
        System.out.println("Even Digits: " + evenCount);
        System.out.println("Odd Digits: " + oddCount);
    }
}
Output:
Even Digits: 2
Odd Digits: 3