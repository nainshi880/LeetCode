class Solution {
    public boolean canConstruct(String r, String m) {
        
        int[] freq = new int[26];
        int count =0;
        for(int i=0;i<m.length();i++){
            freq[m.charAt(i)-'a']++;
        }
        for(int i=0;i<r.length();i++){
          int idx =  r.charAt(i)-'a' ;
          if(freq[idx] > 0){
             freq[idx]--;
             count++;
          }else{
            count = 0;
            break;
          }

           if(count == r.length()){
            return true;
           }
        }
       
        return false;
    }
}