//area of perimeter without using method
public class RectangleWithoutMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double length = 6.0; // Replace with your desired length
	        double width = 4.0;  // Replace with your desired width

	        // Calculate area
	        double area = length * width;

	        // Calculate perimeter
	        double perimeter = 2 * (length + width);

	        // Display results
	        System.out.println("Without using methods:");
	        System.out.println("Area of the rectangle with length " + length + " and width " + width + " is: " + area);
	        System.out.println("Perimeter of the rectangle with length " + length + " and width " + width + " is: " + perimeter);

	}

}

/*
Output:
Without using methods:
Area of the rectangle with length 6.0 and width 4.0 is: 24.0
Perimeter of the rectangle with length 6.0 and width 4.0 is: 20.0  */