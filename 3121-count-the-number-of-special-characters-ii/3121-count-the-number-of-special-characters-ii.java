class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
         int[] low = new int[26];
         int[] up = new int[26];

         Arrays.fill(low,-1);
         Arrays.fill(up,-1);
         for(int i=0;i<n;i++){
            char ch = word.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                low[ch - 'a'] = i;
            }else{

                if(up[ch - 'A'] == -1){
                    up[ch - 'A'] = i;
                }
            }
         }
         int count = 0;

         for(int i=0;i<26;i++){
            if(low[i] != -1 && up[i] != -1 && low[i] < up[i]){
                count++;
            }
         }
           return count;
    }
}