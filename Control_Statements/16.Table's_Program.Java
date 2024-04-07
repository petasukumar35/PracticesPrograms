/* 16. Write a program to print a given number table. 
Example: 2*1=2 
         2*2=4 
         2*3=6 
         2*4=8 
         2*5=10 */
         
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a table number:");
        int number =sc.nextInt();
      
       for(int i=1; i<=10;i++){
           
           System.out.println(number+"*"+i+"="+number*i);
       }
    }
}
