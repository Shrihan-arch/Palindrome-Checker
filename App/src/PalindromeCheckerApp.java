public class PalindromeCheckerApp {git

    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // Mismatch condition
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Normalize string (ignore spaces & case)
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean result = isPalindrome(normalized, 0, normalized.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}