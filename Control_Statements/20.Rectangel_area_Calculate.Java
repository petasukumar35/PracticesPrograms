/*20. Question Title: Rectangle Area Calculator Question Description: You are developing a tool for a construction company that calculates the area of various shapes. 
The company primarily works with rectangular plots. Write a Java method named calculateRectangleArea

that accepts the length and width of a rectangle as parameters and returns the area of the rectangle using a return statement. 
Note: The method calculateRectangleArea should be a public static method which returns a double and takes two parameters: 'length' and 'width' both of type double.

Sample Input 1: 7, 5 
Sample Output 1: 35.0 

Sample Input 2: 10, 6 
Sample Output 2: 60.0 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a width:");
        Double width =sc.nextDouble();
        System.out.println("Enter a length:");
        Double length =sc.nextDouble();
       
      Double area = width*length;
           System.out.print(area);
           
       }
    }


