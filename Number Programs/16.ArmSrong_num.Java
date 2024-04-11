//16. Write a program to check whether a number is armstrong numbers or not.
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
	     sum=rem*rem*rem+sum;
	     n=n/10;
	 }
  if(temp==sum){
      System.out.println("Armstrong Number");
  }
  else{
      System.out.println("Not Armstrong Number");
  }
	  
	}
}
