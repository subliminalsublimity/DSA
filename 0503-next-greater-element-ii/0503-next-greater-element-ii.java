class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length ;
        int [] nge = new int[n];
        Arrays.fill(nge , -1);

        List<Integer> st = new ArrayList<>();
        for(int i=2*n-1 ; i>=0 ; i--){
            while(!st.isEmpty() && st.get(st.size()-1) <= nums[i%n]){
                st.remove(st.size()-1);
            }

            if(i<n){
                nge[i] = st.isEmpty()?-1:st.get(st.size()-1);
            }

            st.add(nums[i%n]);
        }

        return nge;
    }
}