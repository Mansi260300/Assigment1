//print odd numbers from 1 to 10 using for,while,do while
public class OddNumbersFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Using for loop:");
		for(int i = 1; i <= 10; i +=2) {
			
			System.out.println(i);
			
		}
		
		// using whileloop
		
		System.out.println("Using while loop");
		int i =1;
		while (i <= 10) {
			System.out.println(i);
			i += 2;
			
		}
		
		// using do while loop
		
		System.out.println("Using do-while loop");
		int n =1;
		do {
			System.out.println(i);
			i += 2;
			
		} while (i <= 10);
		
		
		
		
		
		
	}
      
}


/*
Output: Using for loop:
1
3
5
7
9
Using while loop:
1
3
5
7
9
Using do-while loop:
11  */