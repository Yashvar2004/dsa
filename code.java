class Solution {
    public int reverseNumber(int num) {
        int reversed = 0;
        int temp = Math.abs(num);
        
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        
        return num < 0 ? -reversed : reversed;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int num1 = 12340;
        System.out.println("Original: " + num1 + ", Reversed: " + solution.reverseNumber(num1));
        
        int num2 = -9876;
        System.out.println("Original: " + num2 + ", Reversed: " + solution.reverseNumber(num2));
        
        int num3 = 1000;
        System.out.println("Original: " + num3 + ", Reversed: " + solution.reverseNumber(num3));
    }
}
