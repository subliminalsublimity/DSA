class Solution {
    private static final Map<Character , String> mpp = new HashMap<>();
    static {
        mpp.put('2',"abc");
        mpp.put('3',"def");
        mpp.put('4',"ghi");
        mpp.put('5',"jkl");
        mpp.put('6',"mno");
        mpp.put('7',"pqrs");
        mpp.put('8',"tuv");
        mpp.put('9',"wxyz");
    }
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return res;
        }
        backtrack(res , new StringBuilder() , digits , 0 );
        return res;
    }

    private void backtrack(List<String> res , StringBuilder curr , String digits , int idx){
        if(idx ==  digits.length()){
            res.add(curr.toString());
            return;
        }

        char digit = digits.charAt(idx);
        String letters = mpp.get(digit);

        for(char ch : letters.toCharArray()){
            curr.append(ch);
            backtrack(res , curr , digits , idx + 1);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}