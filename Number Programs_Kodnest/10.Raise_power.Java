10. Write a java program to print the result of a number when it is raised to power n.
public class Main
{
	public static void main(String[] args) {
	double base = 2.0;
	double exponent = 3.0;
	int result = 1;
	for(int i=1; i<=exponent; i++){
	   result = result*base;
	   //double result = Math.pow(base,exponent);
	}
	 System.out.print(base + " raised to the power of " + exponent + " is " + result);
	}
}
