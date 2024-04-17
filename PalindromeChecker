public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        // Let's remove spaces and convert to lowercase
        str = str.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama"; // Example input
        boolean result = isPalindrome(input);
        System.out.println("Is it a palindrome? " + result);
    }
}
