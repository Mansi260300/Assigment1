//area of perimeter of rectangle using static method

public class RectangleWithStaticMethod {
	 // Static method to calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Static method to calculate the perimeter of a rectangle
    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        double length = 6.0; // Replace with your desired length
        double width = 4.0;  // Replace with your desired width

        // Calculate area using the static method
        double area = calculateArea(length, width);

        // Calculate perimeter using the static method
        double perimeter = calculatePerimeter(length, width);

        // Display results
        System.out.println("Using static methods:");
        System.out.println("Area of the rectangle with length " + length + " and width " + width + " is: " + area);
        System.out.println("Perimeter of the rectangle with length " + length + " and width " + width + " is: " + perimeter);
    }
}

/*
Output:
Using static methods:
Area of the rectangle with the length 6.0 and width 4.0 is:24.0
Perimeter of the rectangle with length 6.0 and width 4.0 is:20.0 */

