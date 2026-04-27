class Solution {
    public int myAtoi(String s) {
         s = s.trim();
        if(s.isEmpty()){
            return 0;
        }
        int index = 0;
        int sign = 1;
        int result = 0;
        if(s.charAt(0) == '-'){
            sign = -1;
            index++;
        }
        else if (s.charAt(0) == '+') {
            index++;
        }
        
         while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            result = result * 10 + digit;
            index++;
        }
        return result*sign;
    }
}