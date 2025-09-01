class Solution {

    private boolean checkPalindrome(String s , int i , int n){
        if(i>=n/2) return true;
        if(s.charAt(i) != s.charAt(n-i-1)) return false;

        return checkPalindrome(s , i+1 , n);
    }

    public boolean isPalindrome(String s) {
        String cleaned = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        return checkPalindrome(cleaned, 0, cleaned.length());


        
    }
}