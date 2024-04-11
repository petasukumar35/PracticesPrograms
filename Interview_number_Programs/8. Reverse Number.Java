8.Reverse Number 

import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter a number:");
	int number = sc.nextInt ();
   while(number>0){
       
       int r = number%10;
       System.out.print(r);
       number=number/10;
   }

  }
}
