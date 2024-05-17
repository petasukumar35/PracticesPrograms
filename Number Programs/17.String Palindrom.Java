17.String Palindrom

public class Main
{
    public static void main(String[] args) {
      String str="level";
      String rev ="";
      int len=str.length();
      for(int i=len-1; i>=0; i--){
          
          rev=rev+str.charAt(i);
      }
      if(str.equals(rev)){
          System.out.println("String Palindrom");
      }
      else{
          System.out.println("Not String Palindrom");
      }
    }
}
output:
String Palindrom