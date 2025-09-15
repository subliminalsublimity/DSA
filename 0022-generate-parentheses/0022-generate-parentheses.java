class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateAll(res , 0 , 0 , "" ,n );
        return res;
    }

    private void generateAll(List<String> res , int left , int right , String s , int n){
        if(s.length() == 2 * n){
            res.add(s);
            return;
        }

        if(left < n){
            generateAll(res , left + 1 , right , s + "(" , n);
        }

        if(right <  left){
            generateAll(res , left , right + 1 , s + ")" , n);
        }
    }
}