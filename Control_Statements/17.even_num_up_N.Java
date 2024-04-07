17. Write a program to print all the even numbers between 1 and n.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a table number:");
        int number =sc.nextInt();
      for(int i=1;i<=number; i++){
       if(i%2==0){
           System.out.print(i+" ");
           
       }
    }
}
}
