//Write a Java program that prints "Discount Applicable" if the purchase is above $100.

import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
	Discount ();
  }
  public static void Discount ()
  {
	Scanner sc = new Scanner (System.in);
	System.out.println ("Enter a Amount: ");
	int purchase = sc.nextInt ();

	if (purchase >= 100)
	  {
		System.out.println ("Discount Applicable");
	  }
	else if (purchase <= 100)
	  {
		System.out.println ("Not Discount Applicable");
	  }
  }
}
