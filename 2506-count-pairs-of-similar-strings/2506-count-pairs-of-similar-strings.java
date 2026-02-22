class Solution {
    public int similarPairs(String[] words) {
        
         HashMap<String, Integer> map = new HashMap<>();
        int ans = 0;
        for( String word : words){
              boolean[] present = new boolean[26];

              for(char ch : word.toCharArray()){
                   present[ch - 'a'] = true;
              }
                   StringBuilder key = new StringBuilder();
                 for(int i=0;i<26;i++){
                    if(present[i]){
                        key.append((char)i + 'a');
                    }
                 }
                    String k = key.toString();

                    ans += map.getOrDefault(k,0);
                    map.put(k,map.getOrDefault(k,0)+1);
                 

        }
                 return ans;

              
        
    }
}