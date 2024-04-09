// 11. Write a program to print the sum of squares from 1 to n numbers.
public class Main
{
	public static void main(String[] args) {
      int n=3, sum=0;
      for(int i=1; i<=n;i++){
          sum = sum+(i*i);
      }
      System.out.print("The sum of squares from 1 to " + n + " is: " + sum);
	}
}
