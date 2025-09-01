class Solution {
    public int myAtoi(String s) {

        s = s.trim();
        if(s.isEmpty()) return 0 ;

        int idx = 0 , sign = 1 ;

        if(s.charAt(0) == '-'){
            sign = -1;
            idx ++;
        }

        else if(s.charAt(idx) == '+'){
            idx++;
        }

        return convert(s , idx , sign , 0 );

        
    }

    private int convert(String s , int idx , int sign , long number){
        if(idx >= s.length() || !Character.isDigit(s.charAt(idx))){
            return (int) (sign * number);
        }

        int digit = s.charAt(idx) - '0';
        number = number * 10 + digit;

        if(sign == 1 && number > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(sign == -1 && -number < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return convert(s , idx + 1 , sign , number);
    }
}