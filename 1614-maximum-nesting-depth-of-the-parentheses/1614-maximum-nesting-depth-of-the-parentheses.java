class Solution {
    public int maxDepth(String s) {
        int n = s.length();

        int max = 0;
        int open = 0;
       

        char[] c = s.toCharArray();

        for(int i=0;i<n;i++){
            if(c[i] == '('){
                max = Math.max(max, ++open);
            }else if(c[i] == ')'){
                --open;
            }
        }

        return max;
    }
}