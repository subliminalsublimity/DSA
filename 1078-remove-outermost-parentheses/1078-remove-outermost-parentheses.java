class Solution {
    public String removeOuterParentheses(String s) {
        int depth = 0;
        StringBuilder res = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c == '('){
                if(depth > 0){
                    res.append(c);
                }
                depth ++;
            }
            else{
                if(depth > 1){
                    res.append(c);
                }
                depth --;
            }
        }
        return res.toString();
    }
}