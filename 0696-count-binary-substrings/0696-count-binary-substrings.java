class Solution {
    public int countBinarySubstrings(String s) {
        int pre = 0;
        int curr = 1;
        int count = 0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                curr++;
            }else{
                count += Math.min(pre,curr);
                pre = curr;
                curr = 1;
            }
        }
         count += Math.min(pre, curr);

        return count;
    }
}