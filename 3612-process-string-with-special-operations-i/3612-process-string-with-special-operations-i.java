class Solution {
    public String processStr(String s) {
        int n = s.length();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '#'){
                sb.append(sb);
            }else if(ch == '*'){
                if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
                }    
            }else if(ch == '%'){
                sb.reverse();
            }else{
                sb.append(ch);
            }
        }
       
        return sb.toString();
    }
}