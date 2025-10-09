class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int depth = 0 ;

        for(char ch : s.toCharArray()){
            if(ch=='('){
                if(depth > 0){
                     res.append(ch);
                }
                depth ++ ;

            }
            else {
                if(depth > 1){
                    res.append(ch);
                }
                depth --;
            }
        }
            return res.toString();
    }
}