//Write a Java program that prints "Vote Eligible" if a person's age is 18 or above.

import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
	Vote ();
  }
  public static void Vote ()
  {
	Scanner sc = new Scanner (System.in);

	System.out.println ("Enter a age: ");
    
	int age = sc.nextInt ();

	if (age >= 18)
	  {
		System.out.println ("Vote Eligible");
	  }
	else if (age <= 18)
	  {
		System.out.println ("Not Vote Eligible");
	  }
  }
}
