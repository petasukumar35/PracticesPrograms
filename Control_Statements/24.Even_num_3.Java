//Display all odd numbers divisible by 5
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   
	    Scanner sc = new Scanner (System.in);
	    
	    for(int i=1; i<=100; i+=2){
	    
	    if(i% 5 == 0){
	        System.out.print(i+" ");
	    }
	    }
	}
}
