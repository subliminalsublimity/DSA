class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;

        int [] nge = new int[n];
        Arrays.fill(nge , -1);

        Stack<Integer> st = new Stack<>();

        for(int i=2*n-1 ; i>=0 ;i--){
            while(!st.isEmpty() && nums[st.peek()] <= nums[i%n]){
                st.pop();
            }

            if(i<n){
                nge[i] = st.isEmpty()?-1:nums[st.peek()];
            }

            st.push(i%n);
        }

        return nge;
        
    }
}