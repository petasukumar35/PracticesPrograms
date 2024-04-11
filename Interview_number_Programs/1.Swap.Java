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
	
	int temp = a;
	      a=b;
	      b=temp;
	      
	System.out.print("After enter number:");
	System.out.print(a+" ");
	System.out.print(b+" ");
	}
}
