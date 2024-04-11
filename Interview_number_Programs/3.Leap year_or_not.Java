3.Leap year or not

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
          System.out.print("Enter a number:");
          int number = sc.nextInt();
          if(number%100==0 && number%400==0 || number%100!=0 && number%4==0 ){
              System.out.print("Leap Year");
          }
          else{
              System.out.print("Not Leap Year");
          }
          
	}
}
