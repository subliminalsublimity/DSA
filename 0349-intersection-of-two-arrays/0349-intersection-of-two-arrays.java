class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> resList = new ArrayList<>();
        int i=0 , j = 0 ;

        while(i<nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){


             if(resList.isEmpty() || resList.get(resList.size() - 1) != nums1[i]){
                resList.add(nums1[i]);
             }  

             i++;
             j++;
            }

             else if (nums1[i] < nums2[j]){
                i++;
             }
             else{
                j++;
             }
        }

            


            int [] res = new int [resList.size()];
            for(int k=0 ; k<resList.size() ; k++){
                res[k] = resList.get(k);
            }

            return res;
        
    }
}