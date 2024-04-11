//5.Write a program to print the Fibonacci series up to n terms.
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {

	Scanner sc = new Scanner (System.in);
	
	  int a=0, b=1;
	  int n=5;
   for(int i=0; i<=n;i++){
       System.out.print(a+" ");
       
       int c=a+b;
           a=b;
           b=c;
   }
	
  }
}
