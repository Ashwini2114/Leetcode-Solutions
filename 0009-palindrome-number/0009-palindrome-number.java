class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int reversed = 0;
        while(n > 0)
        {
            int digit = n%10;
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
                return false;
            }
            reversed = reversed * 10 + digit;
            n = n/10;
        }
        return (reversed == x);
    }
}