//Circumference of circle with static method
public class CircleWithStaticMethods {
	 // Static method to calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Static method to calculate the circumference of a circle
    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        double radius = 5.0; // Replace with your desired radius

        // Calculate area using the static method
        double area = calculateArea(radius);

        // Calculate circumference using the static method
        double circumference = calculateCircumference(radius);

        // Display results
        System.out.println("Using static methods:");
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
        System.out.println("Circumference of the circle with radius " + radius + " is: " + circumference);
 }
  }

/*
Output: Using static methods:
Area of circle with radius 5.0 is: 78.53981633974483
Circumference of the circle with radius 5.0 is: 31.41592653589793  */
