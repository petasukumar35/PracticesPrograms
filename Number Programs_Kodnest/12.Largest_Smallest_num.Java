//12. Write a program to find the largest digit in a number.
public class Main
{
	public static void main(String[] args) {
     int n=1234,d;
     
	int mini = Integer.MAX_VALUE;
	int maxi = Integer.MIN_VALUE;
	while (n != 0)
	{
		d = n % 10;
		mini = Math.min(mini,d);
		maxi = Math.max(maxi,d);
		n = n / 10;
	}

	System.out.println("The Smallest digit in a number is: "+mini);
	System.out.print("The Largest digit in a number is: "+maxi);
	}
}
