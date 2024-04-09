2.Write a program to print all the odd numbers between 1 and n.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for(int i=1; i<=n;i++){
		if(i%2!=0){
		    
		    System.out.print(i+" ");
		}
		}	
	}
}
