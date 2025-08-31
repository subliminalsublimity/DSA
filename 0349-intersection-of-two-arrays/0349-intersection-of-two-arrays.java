class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> st = new HashSet<>();

        for(int i=0 ; i<nums1.length ; i++){
            st.add(nums1[i]);
        }

        Set<Integer> resultSet = new HashSet<>();
        for(int i=0 ; i<nums2.length;i++){
            if(st.contains(nums2[i])){
                resultSet.add(nums2[i]);
            }
        }


        int [] res = new int[resultSet.size()];
        int idx = 0;
        for(int num : resultSet){
            res[idx++] = num;
        }

        return res;


       
        
    }
}