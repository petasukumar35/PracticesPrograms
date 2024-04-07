7.Write a Java program that determines if a person is eligible for a senior citizen discount based on their age.
import java.util.*;
public class Main
{
  public static void age()
  {
	Scanner sc = new Scanner (System.in);
	  System.out.println ("Enter a age: ");
	int age = sc.nextInt ();

	if (age >= 60)
	  {

		System.out.println ("Eligible for a senior citizen discount");
	  }
	else
	  {

		System.out.println ("Not Eligible for a senior citizen discount");
	  }

  }
  public static void main (String[]args)
  {

	age();
  }
}
