//4. Write a program to calculate the factorial of a given number. 5!=120 
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {

	Scanner sc = new Scanner (System.in);
	int sum = 1;
	  System.out.println ("Enter a number:");
	int n = sc.nextInt ();
	for (int i = 1; i <= n; i++)
	  {

		sum = sum * i;
	
	  }
	System.out.print (sum + " ");
  }
}
