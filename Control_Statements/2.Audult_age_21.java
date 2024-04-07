2.write java program that prints "Audult" if the age is above 21.

import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
	 age();

  }
  public static void age ()
  {
	Scanner sc = new Scanner (System.in);
/*	System.out.println ("Enter a age: ");
	int n = sc.nextInt (); */
	int age = 20;
	if (age >=21)
	  {
		System.out.println ("Audult");
	  }
	else if(age<=21)
	  {
		System.out.println ("Not Audult");
	  }
  }
}
