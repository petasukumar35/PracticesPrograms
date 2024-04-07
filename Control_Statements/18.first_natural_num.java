18. Write a program to calculate the sum of first n natural numbers.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural numbers:");
        int number =sc.nextInt();
        int sum=0;
      for(int i=1;i<=number; i++){
            sum =sum+i;
           System.out.print(i+" ");
           
       }
    }
}
