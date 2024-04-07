10.Write a Java program that checks whether a number is a multiple of 10.
import java.util.*;
public class Main
{
  public static void Program ()
  {
	Scanner sc = new Scanner (System.in);
	  System.out.println ("Enter a Number: ");
	int Number = sc.nextInt ();

	if (Number%10==0)
	  {

		System.out.println (Number + " is a multiple of 10.");
	  }

	else
	  {
		System.out.println (Number + " is not a multiple of 10.");
	  }

  }
  public static void main (String[]args)
  {

	Program ();
  }
}
