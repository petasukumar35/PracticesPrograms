`7. Write a program to print the first n prime numbers.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  int i, j;
	  Scanner sc = new Scanner (System.in);
	  System.out.println("Enter a number1: ");
	  int n1=sc.nextInt();
	  System.out.println("Enter a number2: ");
	  int n2=sc.nextInt();
	  for(i=n1;i<=n2;i++){
	      for(j=2; j<=i;j++){
	          if(i%j==0)
	          break;
	      }
	      if(i==j){
	          System.out.print(j+" ");
	      }
	  }
	}
}
