class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;
      
        HashMap<Integer , Integer> mpp = new HashMap<>();

        for(int i=0 ; i<n;i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i] , 0) + 1);
        }

        for(int it : mpp.keySet()){
            if(mpp.get(it) > n/2){
                return it;
            }

        }

        return -1;
    }
}