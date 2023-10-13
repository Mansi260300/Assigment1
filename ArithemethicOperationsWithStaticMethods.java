// using static method
public class ArithemethicOperationsWithStaticMethods {
	 // Static method to calculate the sum of two numbers
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    // Static method to calculate the difference of two numbers
    public static int calculateDifference(int a, int b) {
        return a - b;
    }

    // Static method to calculate the product of two numbers
    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    // Static method to calculate the quotient of two numbers
    public static int calculateQuotient(int a, int b) {
        return a / b;
    }

    // Static method to calculate the remainder of two numbers
    public static int calculateRemainder(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 4;

        // Calculate sum using static method
        int sum = calculateSum(num1, num2);

        // Calculate difference using static method
        int difference = calculateDifference(num1, num2);

        // Calculate product using static method
        int product = calculateProduct(num1, num2);

        // Calculate quotient using static method
        int quotient = calculateQuotient(num1, num2);

        // Calculate remainder using static method
        int remainder = calculateRemainder(num1, num2);

        // Display results
        System.out.println("Using static methods:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}

/*
Output: Using static methods:
Sum: 14
Difference: 6
Product: 40
Quotient: 2
Remainder: 2  */


