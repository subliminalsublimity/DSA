class Solution {
    public int myAtoi(String s) {


  
       
        s = s.trim();
        if (s.isEmpty()) return 0;   

        int index = 0;
        int sign = 1;

        
        if (s.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(index) == '+') {
            index++;
        }

        
        return convert(s, index, sign, 0);
    }

    private int convert(String s, int index, int sign, long number) {
        
        if (index >= s.length() || !Character.isDigit(s.charAt(index))) {
            return (int)(sign * number);
        }

        
        int digit = s.charAt(index) - '0'; 
        number = number * 10 + digit;

       
        if (sign == 1 && number > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (sign == -1 && -number < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

       
        return convert(s, index + 1, sign, number);
    }
}