//    Write a Program to Find Prime Numbers in Given Range.
//       Input: 2 10
//      Output: Prime Numbers bw 2 and 10 are b 2 3 5 7

public class Main
{
  public static void main (String[]args)
  {

	int n1 = 2;

	int n2 = 10;

	for (int i = n1; i <= n2; i++)
	  {
		int count = 0;

		for (int j = 1; j <= i; j++)

		  {
			if (i % j == 0)

			  count = count + 1;
		  }

		if (count == 2)

		  System.out.print (i + " ");
	  }
  }

}
Output: 2 3 5 7 