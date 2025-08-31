class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int idx = 0;
        int nonZeroEle = 0;

        for(int i=0 ; i<n ; i++){
            if(nums[i] != 0){
                nums[nonZeroEle++] = nums[i];
            }
        }

        while(nonZeroEle < n){
            nums[nonZeroEle++] = 0;
        }
        
    }
}