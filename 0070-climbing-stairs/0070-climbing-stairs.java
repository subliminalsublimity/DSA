class Solution {
    public int climbStairs(int n) {
        int [] dp = new int [n + 1];
        Arrays.fill(dp , -1);
        return climbingStairs (n , dp );
    }


        public int climbingStairs(int n , int [] dp){
            if(n == 1) return 1;
            if(n == 2) return 2;

            if(dp[n] != -1) return dp[n];

            dp[n] = climbingStairs(n-1 , dp ) +  climbingStairs(n-2 , dp);
            return dp[n]; 
        }
}