class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set <List<Integer>>  st = new HashSet<>();
        int n = nums.length;

        for(int num = 0 ; num < (1 << n) ;num++ ){
           List<Integer> subset = new ArrayList<>();
            for(int i=0 ; i<n ; i++){
                if((num & (1 << i)) != 0){
                  subset.add(nums[i]);
                }
            }
            st.add(subset);
        }

       
        return new ArrayList<>(st);
    }
}