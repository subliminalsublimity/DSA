class Solution {
    public int rob(int[] nums) {
        int n = nums.length ;
        if(n == 1) return nums[0];

        int [] dp1 = new int [n];
        Arrays.fill(dp1 , -1);
        int firstHouse = helper(n-2 , nums , 0 , dp1);

        int [] dp2 = new int [n];
        Arrays.fill(dp2 , -1); 
        int lastHouse = helper(n-1 , nums , 1 , dp2);
        return  Math.max(firstHouse , lastHouse);
       
    }

    public int helper(int idx , int [] nums , int start ,int [] dp){
        if(idx < start) return 0;
        if(idx == start ) return nums[start];

        if(dp[idx] != -1) return dp[idx];

        int pick = nums[idx] + helper(idx - 2 , nums , start , dp);
        int notPick = helper(idx - 1 , nums , start , dp);

        dp[idx] = Math.max(pick , notPick);
        return dp[idx];
    }
}