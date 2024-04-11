3.Write a program to calculate the sum of first n natural numbers.Adding the numbers ex: 1+2+3+4+5; sum=15;
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {

	Scanner sc = new Scanner (System.in);
	int sum = 0;
	  System.out.println ("Enter a number:");
	int n = sc.nextInt ();
	for (int i = 1; i <= n; i++)
	  {

		sum = sum + i;


	  }
	System.out.print (sum + " ");
  }
}
