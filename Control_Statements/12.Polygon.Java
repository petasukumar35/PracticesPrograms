12.Write a Java program that identifies the type of a polygon based on the number of its sides.
import java.util.Scanner;

public class PolygonIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of sides
        System.out.print("Enter the number of sides of the polygon: ");
        int numSides = scanner.nextInt();

        // Identify the type of polygon based on the number of sides
        String polygonType;
        switch (numSides) {
            case 3:
                polygonType = "Triangle";
                break;
            case 4:
                polygonType = "Quadrilateral";
                break;
            case 5:
                polygonType = "Pentagon";
                break;
            case 6:
                polygonType = "Hexagon";
                break;
            case 7:
                polygonType = "Heptagon";
                break;
            case 8:
                polygonType = "Octagon";
                break;
            case 9:
                polygonType = "Nonagon";
                break;
            case 10:
                polygonType = "Decagon";
                break;
            default:
                polygonType = "Polygon with " + numSides + " sides";
        }

        // Display the type of polygon
        System.out.println("The polygon is a " + polygonType + ".");

        scanner.close();
    }
}
