//Intialize an int array,char array and a string array with values.
public class ArrayInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Initialize an integer array
        int[] intArray = {1, 2, 3, 4, 5};

        // Initialize a character array
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};

        // Initialize a string array
        String[] stringArray = {"Mansi", "Priya", "Namrata", "Nayan", "Namu"};

        // Print the initialized arrays
        System.out.println("Integer Array:");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Character Array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("String Array:");
        for (String str : stringArray) {
            System.out.println(str);
        }
        
		
      
        }
    
	}


/*
Output:Mansi
       Priya
       Namrata
       Nayan
       Namu  */  
