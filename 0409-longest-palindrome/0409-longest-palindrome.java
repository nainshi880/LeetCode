class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        int freq[] = new int[128];
        int maxLen = 0;
        for(char c: s.toCharArray()){
            freq[c]++;
        }
        boolean isOdd = false;
        for(int i=0;i<128;i++){
            if(freq[i]%2 == 0){
                maxLen += freq[i];
            }else{
                maxLen += freq[i]-1;
                isOdd = true;
            }
        }
            if(isOdd){
                maxLen = maxLen+1;
            }
        
        return maxLen;
    }
}