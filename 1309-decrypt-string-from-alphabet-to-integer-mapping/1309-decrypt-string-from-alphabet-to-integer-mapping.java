class Solution {
    public String freqAlphabets(String s) {
        int n = s.length();

        StringBuilder sb = new StringBuilder();

        for(int i=n-1;i>=0;i--){
            int num = 0;
            if(s.charAt(i) == '#'){
                num = (s.charAt(i-2)-'0')*10 + (s.charAt(i-1)-'0');
                i -= 2;
            }else{
                num = s.charAt(i) - '0';
            }
            sb.append((char) (num+96));
        }
        return sb.reverse().toString();
    }
}