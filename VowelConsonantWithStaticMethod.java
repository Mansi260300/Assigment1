// passing the character tp the static method and returning the result
public class VowelConsonantWithStaticMethod {
	  // Static method to check if a character is a vowel or consonant
    public static String checkVowelOrConsonant(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return "vowel";
        } else {
            return "consonant";
        }
    }

    public static void main(String[] args) {
        char ch = 'a'; // Replace with the character you want to check

        // Call the static method and display the result
        String result = checkVowelOrConsonant(ch);
        System.out.println(ch + " is a " + result + ".");
    }

}
/* a is a vowel. */
