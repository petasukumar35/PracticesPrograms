2.even number or odd number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
          System.out.print("Enter a number:");
          int number = sc.nextInt();
          if(number%2==0){
              System.out.print("Even Number");
          }
          else{
              System.out.print("odd Number");
          }
          
	}
}
