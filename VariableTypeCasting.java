package practiceJava.Variables_Datatrype_Operators;

import java.util.Scanner;

public class VariableTypeCasting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the diameter of the circle: ");
        int diameter = scanner.nextInt();

        // To Calculate radius
        double radius = diameter / 2.0;

        // Calculate area
        double area = Math.PI * radius * radius;

        // Calculate Perimeter (circumference)
        double perimeter = 2 * Math.PI * radius;

        // Perform widening casting operation
        double areaDouble = (double) area;
        double perimeterDouble = (double) perimeter;

        System.out.println("Area of the circle: " + areaDouble);
        System.out.println("Perimeter of the circle: " + perimeterDouble);

        scanner.close();

	}


}
