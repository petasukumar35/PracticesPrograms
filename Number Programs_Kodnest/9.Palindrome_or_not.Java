9.Write a program to check whether a number is a palindrome or not.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int temp,sum=0,rem;
	  Scanner sc = new Scanner (System.in);
	  System.out.println("Enter a number1: ");
	  int n=sc.nextInt();
	  temp=n;
	 while(n>0){
	     
	     rem=n%10;
	     sum=sum*10+rem;
	     n=n/10;
	 }
  if(temp==sum){
      System.out.println("Prime Number");
  }
  else{
      System.out.println("Not Prime Number");
  }
	  
	}
}
