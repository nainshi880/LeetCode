class Solution {
    public boolean canConstruct(String r, String m) {
        
        int[] freq = new int[26];
        
        for(int i=0;i<m.length();i++){
            freq[m.charAt(i)-'a']++;
        }
        for(int i=0;i<r.length();i++){
          int idx =  r.charAt(i)-'a' ;
          if(freq[idx] == 0){
            return false;
          }

           freq[idx]--;
        }
       
        return true;
    }
}