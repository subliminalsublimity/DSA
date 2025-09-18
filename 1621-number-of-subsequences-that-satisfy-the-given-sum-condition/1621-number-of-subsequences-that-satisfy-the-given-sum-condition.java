class Solution {
    private static final int MOD = 1000000007;
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);

        int[] pow2 = new int [n];
        pow2[0] = 1;
        for(int i=1 ; i<n ; i++){
            pow2[i] = (pow2[i-1] * 2) % MOD;
        }

        int l =0 , r = n - 1;
        long ans = 0;
        while(l <=r){
            if(nums[l] + nums[r] <= target){
                ans = (ans + pow2[r - l]) % MOD;
                l++;
            }
            else r--;
        }
        return (int) ans;
    }
}

        
    