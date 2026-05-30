class Solution {
    public String sortSentence(String s) {
        int n = s.length();
        String []str = s.split(" ");
        String[] res = new String[str.length];
        StringBuilder sb = new StringBuilder();
              int i =0;
        for(String ele : str){
             i = (int) (ele.charAt(ele.length() - 1) - '0');
             res[i-1] = ele.substring(0,ele.length()-1);

        }
        for(i = 0;i<res.length-1;i++){
            sb.append(res[i]).append(" ");
        }
            sb.append(res[i]);
            return sb.toString();
        
    }
}