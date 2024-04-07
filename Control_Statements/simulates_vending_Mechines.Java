13. Write a Java program that simulates a vending machine. The program should take a product code as input and output the product name. 
“P01” -> CocaCola 
“P02”->Pepsi 
“P03”->Maggi 

import java.util.Scanner;

public class PolygonIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of sides
        System.out.print("Enter the product code: ");
        String Code = sc.nextLine();

        // Identify the type of polygon based on the number of sides
        String Product_Name;
        switch (Code) {
            case "P01":
                Product_Name = "CocaCola";
                break;
            case "P02":
                Product_Name = "Pepsi";
                break;
            case "P03":
                Product_Name = "Maggi";
                break;
            
            default:
                 Product_Name ="Invalid Product Code";
        }

        // Display the type of polygon
        System.out.println("Product Name is "+Product_Name);

    }
}
