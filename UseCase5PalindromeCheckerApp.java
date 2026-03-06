import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        
        String word = "madam";

        Stack<Character> stack = new Stack<>();

        
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        boolean isPalindrome = true;

        
        for (int i = 0; i < word.length(); i++) {
            char ch = stack.pop();

            if (word.charAt(i) != ch) {
                isPalindrome = false;
                break;
            }
        }

        
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}