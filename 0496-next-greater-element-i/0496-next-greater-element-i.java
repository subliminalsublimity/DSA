class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int i=nums2.length - 1 ; i>=0;i--){
            int curr = nums2[i];
            while(!st.isEmpty() && st.peek() <= curr){
                st.pop();
            }

            int nge = st.isEmpty()?-1:st.peek();

            mpp.put(curr , nge);
            st.push(curr);
        }

        int [] ans = new int [nums1.length];
        for(int i=0 ; i<nums1.length;i++){
           ans[i]=  mpp.get(nums1[i]);
        }
        return ans;
    }
}