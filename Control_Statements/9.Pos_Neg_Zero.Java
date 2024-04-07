9.Write a Java program that accepts an integer and prints whether it's negative, positive, or zero.
import java.util.*;
public class Main
{
  public static void Program ()
  {
	Scanner sc = new Scanner (System.in);
	  System.out.println ("Enter a Number: ");
	int Number = sc.nextInt ();

	if (Number > 0)
	  {

		System.out.println ("Positive");
	  }
	else if (Number < 0)
	  {

		System.out.println ("Negative");
	  }
	else
	  {
		System.out.println ("Zero");
	  }

  }
  public static void main (String[]args)
  {

	Program ();
  }
}
