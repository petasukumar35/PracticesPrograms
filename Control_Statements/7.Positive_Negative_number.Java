7.Write a Java program that checks whether a number is positive or negative.

import java.util.*;
public class Main
{
  public static void Positive_Negative ()
  {
	Scanner sc = new Scanner (System.in);
	  System.out.println ("Enter a number: ");
	int number = sc.nextInt ();

	if (number >= 0)
	  {

		System.out.println ("Positive Number");
	  }
	else
	  {

		System.out.println ("Negative Number");
	  }

  }
  public static void main (String[]args)
  {

	Positive_Negative ();
  }
}
