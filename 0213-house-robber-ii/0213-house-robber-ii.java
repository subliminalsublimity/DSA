class Solution {
    public int rob(int[] nums) {
        int n = nums.length ;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0] , nums[1]);
       int firstHouse = helper(n-2 , nums , 0);
       int lastHouse = helper(n-1 , nums , 1 );

       return Math.max(firstHouse , lastHouse);
    }

    public int helper( int end , int [] nums , int start ){
        int n = end - start + 1;
        if( n == 1 ) return nums[start];
         int [] dp = new int [n];
        dp[0] = nums[start];
        dp[1]= Math.max(nums[start] , nums[start+1]);


        for(int i= 2; i<n ; i++){
            int pick = nums[i + start] + dp[i-2];
            int notPick = dp[i-1];
            dp[i] = Math.max(pick , notPick);
        }
    return dp[n-1];
    }
}