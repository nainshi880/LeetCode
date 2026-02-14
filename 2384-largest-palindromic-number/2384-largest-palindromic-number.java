class Solution {
    public String largestPalindromic(String num) {
       int n = num.length();
       int[] freq = new int[10];
       for(char c : num.toCharArray()){
        freq[c - '0']++;
       }
        StringBuilder left = new StringBuilder();
        String middle = "";
        for(int d=9;d>=0;d--){
            int pairs = freq[d]/2;
            for (int i = 0; i < pairs; i++) {
                left.append(d);
            }
        freq[d] -= pairs*2;
        }
           for (int d = 9; d >= 0; d--) {
            if (freq[d] > 0) {
                middle = String.valueOf(d);
                break;
            }
        }
        while(left.length()>0 && left.charAt(0) == '0'){
            left.deleteCharAt(0);
        }
        if(left.length() == 0 && middle.equals("")){
            return "0";
        }
        String right = left.reverse().toString();
        left.reverse();

        return left.toString()+middle+right;
    }
}