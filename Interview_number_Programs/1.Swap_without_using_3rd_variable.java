1.Swap number without using 3rd variable.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a two number: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	System.out.print("Before enter number:");
	System.out.print(a+" ");
	System.out.println(b+" ");
	
	    a= a+b;
	    b=a-b;
	    a=a-b;
	      
	System.out.print("After enter number:");
	System.out.print(a+" ");
	System.out.print(b+" ");
	}
}
