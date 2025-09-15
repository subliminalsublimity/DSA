class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if(n <= 0) return res;
        char [ ] curr = new char [ 2 * n];
        generateAll(curr , 0 , res);
        return res;
        
    }

    private void generateAll(char[] curr , int pos , List<String> res){
        if(pos == curr.length){
            if(isValid(curr)){
                res.add(new String(curr));
            }
            return;
        }

    curr[pos] = '(';
    generateAll(curr , pos + 1 , res);

    curr[pos] = ')';
    generateAll(curr , pos + 1 , res);
    }

    private boolean isValid(char [] arr){
        int balance = 0;
        for (char c : arr){
            if(c == '(') balance++;
            else balance--;
            if(balance < 0) return false;
        }
        return balance == 0;
    }
}