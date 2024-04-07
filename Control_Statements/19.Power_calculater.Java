/*19. Question Title: Power Calculator 

Question Description: You are creating a mathematical tool for a group of scientists. 
They often need to calculate powers of numbers. 
Write a Java program using a for loop to calculate the power of a number. 
The program should take two integer parameters: the base and the exponent, 
and return the base raised to the power of the exponent. 

Sample Input 1: 2, 3 
Sample Output 1: 8 

Sample Input 2: 5, 4 
Sample Output 2: 625 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a base:");
        int base =sc.nextInt();
        System.out.println("Enter a exponent:");
        int exponent =sc.nextInt();
       
      Double result = Math.pow(base,exponent);
           System.out.print("Power is"+result);
           
       }
    }


