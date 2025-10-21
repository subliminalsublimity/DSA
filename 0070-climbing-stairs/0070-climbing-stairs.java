class Solution {
    public int climbStairs(int n) {
        int prev = 2 , prev2 = 1 , curr = 0  ;

        if(n == 1) return 1;
        if(n == 2) return 2;

        for(int i=3 ; i<=n ; i++){
            curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }
        return curr;
    }
}