class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        generate(0 ,nums , res , new ArrayList<>());
        return res;
    }

    private void generate(int ind , int [] nums , List<List<Integer>> res , List<Integer> ds){
        if(ind == nums.length ){
            res.add(new ArrayList<>(ds));
            return;
        }

        ds.add(nums[ind]);
        generate(ind + 1, nums , res , ds);
        ds.remove(ds.size() -1 );

        generate(ind + 1 , nums , res , ds);
    }
}