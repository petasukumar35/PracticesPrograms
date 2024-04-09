13. Write a program to find the square root of a number. (use Math.sqrt())
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter a number:");
	   double number =sc.nextDouble();
	   double result = Math.sqrt(number);
	   System.out.print(result);
	    
    
	}
}
/* output:
     Enter a number:9
     3.0 */