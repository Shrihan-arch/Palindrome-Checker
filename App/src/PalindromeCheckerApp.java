public class PalindromeCheckerApp {

    // Public method (Service API)
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        String normalized = preprocess(input);
        return isPalindrome(normalized);
    }

    // Private preprocessing (Encapsulation)
    private String preprocess(String input) {
        return input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    // Internal palindrome logic
    private boolean isPalindrome(String str) {

        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Main method (Application entry point)
    public static void main(String[] args) {

        PalindromeCheckerApp checker = new PalindromeCheckerApp();

        String input = "racecar";

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}