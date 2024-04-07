Write a java program to print the numbers according to the below requirement from 1 to n, 
where n > 100. 
1. Display all numbers divisible by 2 
2. Display all numbers divisible by 3 
3. Display all numbers divisible by 5 
4. Display all numbers divisible by 2 and 5 
5. Display all numbers divisible by 3 and comes in table of 5 
6. Display all prime numbers 
7. Display all even numbers divisible by 3 
8. Display all odd numbers divisible by 5 
9. Display all even prime numbers 
10. Display all odd prime numbers
public class NumberPrinter {
    public static void main(String[] args) {
        int n = 100; // Change the value of n as per your requirement

        System.out.println("Numbers divisible by 2:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nNumbers divisible by 3:");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nNumbers divisible by 5:");
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nNumbers divisible by 2 and 5:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nNumbers divisible by 3 and comes in the table of 5:");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nPrime numbers:");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nEven numbers divisible by 3:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nOdd numbers divisible by 5:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nEven prime numbers:");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) && i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nOdd prime numbers:");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
