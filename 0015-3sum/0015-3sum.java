class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0 ; i<n ;i++){
            Set<Integer> hash = new HashSet<>();
            for(int j= i+1 ; j<n ; j++){
                int third = -(nums[i] +  nums[j]);
                if(hash.contains(third)){
                    List<Integer> triplet = Arrays.asList(nums[i] , nums[j] , third);
                    Collections.sort(triplet);
                    st.add(triplet);
                }
                hash.add(nums[j]);

            }
        }
        return new ArrayList<>(st);
        
    }
}