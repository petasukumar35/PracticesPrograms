6. Write a program to find the GCD of two numbers.GCD stands greatest common diviser 
public class Main
{
	public static void main(String[] args) {
		int n1=3, n2=6;
		int ans = 1;
		for(int i=1; i<=Math.min(n1,n2); i++){
		    if(n1%i==0 && n2%i==0)
		     ans =i;
		}
		System.out.print(ans);
	}
}
