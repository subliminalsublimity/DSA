class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        Set<Integer> st = new LinkedHashSet<>();
        for(int i=0 ; i<n ; i++){
            st.add(nums[i]);
        }

        int indx = 0;
        for(int it : st){
            nums[indx] = it;
            indx++;
        }
        return indx;
        
    }
}