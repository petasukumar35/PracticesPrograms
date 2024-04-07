5.Write a Java program that prints "Capital Letter" if the given character is a capital letter.

import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
	CapitalLetter();
  }
  public static void CapitalLetter()
  {
	Scanner sc = new Scanner (System.in);

	System.out.println ("Enter a letter: ");
	
	char character = sc.next().charAt(0);

	if (character>='A' && character<='Z')
	  {
		System.out.println ("Capital Letter");
	  }
	else 
	  {
		System.out.println ("Not Capital Letter");
	  }
  }
}
