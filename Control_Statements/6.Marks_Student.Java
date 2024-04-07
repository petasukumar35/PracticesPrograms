6.Write a Java program that prints "Pass" if a student's grade is above 50, else it prints "Fail".

import java.util.*;
public class Main
{
  public static void Grades ()
  {
	Scanner sc = new Scanner (System.in);
	  System.out.println ("Enter a number: ");
	int Marks = sc.nextInt ();

	if (Marks >= 50)
	  {

		System.out.println ("Pass");
	  }
	else
	  {

		System.out.println ("Fail");
	  }

  }
  public static void main (String[]args)
  {

	Grades ();
  }
}
