class Solution {

    private boolean checkPalindrome(String s , int i , int n){
        if(i>=n/2) return true;
        if(s.charAt(i) != s.charAt(n-i-1)) return false;

        return checkPalindrome(s , i+1 , n);
    }

    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();

        for(char c : s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
               str.append(Character.toLowerCase(c));
            }   
        }

        String clean = str.toString();
        return checkPalindrome(clean , 0 , clean.length());




        
    }
}