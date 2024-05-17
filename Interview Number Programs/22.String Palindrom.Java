22. String palindrome
public class Main
{
	public static void main(String[] args) {
	 String str="leve";
	 String rev ="";
	 int n=str.length();
	 for(int i=n-1; i>=0; i--){
	     rev=rev+str.charAt(i);
	 }
	 if(str.equals(rev)){
	     System.out.print("String Palindrom");
	 }
	 else{
	      System.out.print("Not String Palindrom");
	 }
	}
}
