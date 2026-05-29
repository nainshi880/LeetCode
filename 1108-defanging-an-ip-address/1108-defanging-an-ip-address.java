class Solution {
    public String defangIPaddr(String add) {
        int n = add.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char c = add.charAt(i);
            if(c == '.'){
               sb.append("[.]");
            }else{
            sb.append(c);
            }
        }
        return sb.toString();
    }
}