//22.Print All Prime Numbers With Num1 and Num2

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int i,j;
	    Scanner sc = new Scanner (System.in);
	    System.out.println("Enter a two number:");
	    int n1 = sc.nextInt();
	     int n2 = sc.nextInt();
	    
	    for( i=n1; i<=n2; i++){
	        for( j=2; j<=i; j++){
	            if(i%j==0)
	            break;
	        }
	        if(i==j){
	            System.out.print(j+" ");
	        }
	        
	    }
	}
}
