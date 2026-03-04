public class code2 {
    
    // Check if string is palindrome
    public boolean isPalindrome(String str) {
        String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
    
    // Check if number is palindrome
    public boolean isPalindromeNumber(int num) {
        int original = num;
        int reversed = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        return original == reversed;
    }
    
    public static void main(String[] args) {
        code2 solution = new code2();
        
        // String palindrome tests
        System.out.println("--- String Palindrome Tests ---");
        System.out.println("'racecar' is palindrome: " + solution.isPalindrome("racecar"));
        System.out.println("'A man, a plan, a canal: Panama' is palindrome: " + solution.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("'hello' is palindrome: " + solution.isPalindrome("hello"));
        System.out.println("'noon' is palindrome: " + solution.isPalindrome("noon"));
        
        // Number palindrome tests
        System.out.println("\n--- Number Palindrome Tests ---");
        System.out.println("121 is palindrome: " + solution.isPalindromeNumber(121));
        System.out.println("12321 is palindrome: " + solution.isPalindromeNumber(12321));
        System.out.println("123 is palindrome: " + solution.isPalindromeNumber(123));
        System.out.println("-121 is palindrome: " + solution.isPalindromeNumber(-121));
    }
}
