1.write java program that prints "Postive Number" if the given number is greater than 0

import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
	positiveNumber ();

  }
  public static void positiveNumber ()
  {
	Scanner sc = new Scanner (System.in);
	System.out.println ("Enter a Number: ");
	int n = sc.nextInt ();
	if (n > 0)
	  {
		System.out.println ("Positive Number");
	  }
	else
	  {
		System.out.println ("Not a Positive Number");
	  }
  }
}