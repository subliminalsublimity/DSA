class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int [] dp = new int [n];
         Arrays.fill(dp , -1);
         return helper(n-1 , nums , dp);
    }

    public int helper(int idx , int [] nums , int [] dp ){
       
        if(idx < 0 ) return 0 ;
         if(dp[idx] != -1) return dp[idx];
           if (idx == 0 ) return nums[0];

        int pick = nums[idx] + helper(idx - 2 , nums , dp);
        int notPick = helper(idx - 1 , nums , dp);

        dp[idx] = Math.max(pick , notPick);
        return dp[idx];
    }
}