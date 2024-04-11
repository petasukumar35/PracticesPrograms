9. perfect square / Count Digits.

//Count Digits.
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter a numbers:");
	int n = sc.nextInt ();
	int count=0;
   while(n>0){
       n = n/10;
       count=count+1;
   }
   System.out.print(count);
  }
}

// PERFECT SQUARE
 Write a program to find the square root of a number. (use Math.sqrt())
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter a number:");
	   double number =sc.nextDouble();
	   double result = Math.sqrt(number);
	   System.out.print(result);
	    
    
	}
}
/* output:
     Enter a number:9
     3.0 */