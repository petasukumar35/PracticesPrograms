10. GCD of two numbers.GCD stands greatest common diviser 
public class Main
{
	public static void main(String[] args) {
		int n1=3, n2=6;
		int GCD = 1;
		for(int i=1; i<=Math.min(n1,n2); i++){
		    if(n1%i==0 && n2%i==0)
		     GCD =i;
		}
		System.out.print(GCD);
	}
}
Output: The GCD of the two numbers is 4

// LCM OF TWO NUMBERS

public class Main {
  public static void main(String args[]) {
    int a = 4, b = 8;
    int gcd = 1;
    for (int i = 1; i <= Math.min(a, b); i++) {
      if (a % i == 0 && b % i == 0) {
        gcd = i;
      }
    }
    int lcm = (a * b) / gcd;
    System.out.print("The LCM of the two given numbers is "+lcm);

  }
}
Output:

The LCM of the two given numbers is 8


