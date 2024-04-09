//14. Write a program to find the cube root of a number. (use Math.cbrt())
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter a number:");
	   double number =sc.nextDouble();
	   double result = Math.cbrt(number);
	   System.out.print(result);
	    
    
	}
}
/* output:
     Enter a number:8
     2.0 */