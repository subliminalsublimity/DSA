class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        HashSet<Integer> st = new HashSet<>();

        for(int x :nums){
            st.add(x);
        }
         int longest= 1;

        for(int x : st){
            if(!st.contains(x-1)){
                 int curr = x;
                 int cnt = 1;

                 while(st.contains(x+1)){
                    x = x+1;
                    cnt = cnt + 1;
                 }
                 longest = Math.max(longest , cnt);
            }
        }
        return longest;
        
    }
}