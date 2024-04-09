//8.Write a program to calculate the sum of digits of a number.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 int sum=0;
	  Scanner sc = new Scanner (System.in);
	  System.out.println("Enter a number1: ");
	  int n1=sc.nextInt();
	 while(n1>0){
	     sum=sum+n1%10;
	     
	     
	     n1=n1/10;
	 }
	 System.out.print(sum);
	  
	}
}
