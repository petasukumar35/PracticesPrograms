11. Write a Java program that categorizes people based on their age: Child (0-12), Teen (13-19), Adult (20-59), Senior (60+).
import java.util.*;
public class Main
{
  public static void Program ()
  {
	Scanner sc = new Scanner (System.in);
	  System.out.println ("Enter a age: ");
	int age = sc.nextInt ();

	if (age>=0 && age<=12)
	  {

		System.out.println ("Child");
	  }

	else if(age>=13 && age<=19)
	  {
		System.out.println ("Teen");
	  }
	  	else if(age>=20 && age<=59)
	  {
		System.out.println ("Adult");
	  }
	  else{
	      System.out.println ("Senior");
	  }

  }
  public static void main (String[]args)
  {

	Program ();
  }
}
