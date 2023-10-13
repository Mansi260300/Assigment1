//Print even numbers using for
public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		for (int i = 2; i <= 10; i += 2) {
			System.out.println("Using for loop:");
			System.out.println(i);
		}
		
		
		System.out.println("Using while loop:");
		int number = 2;
		while(number <= 10) {
			System.out.println(number);
			number += 2;
			
		}
		
		
		System.out.println("Using do-whileloop:");
		int num = 2;
		do {
			 System.out.println(num);
			 num += 2;
			 
		} while(num <= 10);
		
		

	}
}

/*
Output: Using for loop:
2
4
6
8
10
Using while loop:
2
4
6
8
10
Using do-while loop:
2
4
6
8
10  */

	
