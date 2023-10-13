//store 5 integers in an array and print in reverse order
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create an array to store 5 integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the array in reverse order
        System.out.println("Array in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

	}

}

/*
Output: 
Array in reverse order:
5
4
3
2
1 */