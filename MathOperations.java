// Initialize 2 numbers and initialize 1 char variable for mathematical operator. Find the sum, difference, product and quotient and remainder depending on the mathematical operator value. (Use switch statement).
public class MathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // Initialize two numbers and a mathematical operator
        double num1 = 20.0;
        double num2 = 5.0;
        char operator = '*'; // You can change this operator (+, -, *, /, %) to test different operations

        // Perform calculations based on the operator
        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Sum: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Difference: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Product: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Quotient: " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Remainder: " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }

	}

/*
Output: Product: 100.0  */



