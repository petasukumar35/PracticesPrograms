15.Perfect number or not

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a Number:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1; i<n;i++){
		    if(n%i==0)
		    sum=sum+i;
		}
		if(n==sum){
		    System.out.print("Perfect Number");
		}
		else{
		    System.out.println("Not Perfect Number");
		}
	}
}
 Output:
Enter a Number:28
Perfect Number