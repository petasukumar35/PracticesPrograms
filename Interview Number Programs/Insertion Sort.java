Insertion Sort Algorthem

public class Main
{
	public static void main(String[] args) {
	 int arr [] = {13, 46, 24, 52, 20, 9};
	 int n = arr.length;
	 System.out.println("Before insertion Sort:");
	 for(int i=0; i<n; i++)
	 {
	     System.out.print(arr[i]+" ");
	 }
	 // OuterLoop
	 for(int i=0; i<=n-1; i++)
	 {
	     int j=i;
	     while(j>0 && arr[j-1]>arr[j])
	     {
	         int tmp = arr[j-1];
	          arr[j-1] = arr[j];
	          arr[j] = tmp;
	          j--;
	     }
	 }
	 System.out.println();
	  System.out.println("After insertion Sort:");
	  for(int i=0; i<n; i++)
	 {
	     System.out.print(arr[i]+" ");
	 }
	}
}

Output:
Before insertion Sort:
13 46 24 52 20 9 
After insertion Sort:
9 13 20 24 46 52 