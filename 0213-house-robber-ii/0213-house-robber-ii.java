class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1 ) return nums[0];
        if(n == 2) return Math.max(nums[0] , nums[1]);


        int firstHouse = helper(n-2 , nums , 0);
        int lastHouse = helper(n-1 , nums , 1);

        return Math.max(firstHouse , lastHouse);
    }


    public int helper(int end , int [] nums , int start ){
        int n = end - start + 1;
        if(n == 1) return nums[start];
        int prev2 = nums[start] ;
        int prev = Math.max(nums[start] , nums[start + 1]) ;
        int curr = prev;

        for(int i=2 ; i<n ; i++){
            curr = Math.max(prev2 + nums[start + i] ,  prev);
            prev2 = prev;
            prev = curr;
        }
        return curr;
    }
}