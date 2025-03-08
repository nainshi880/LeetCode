class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int minop = 0;
        for(int i =0;i<k ;i++){
            if(blocks.charAt(i) == 'W'){
                minop++;
            }
        }
            int curr = minop;
           for(int i=k;i<n;i++){
             if(blocks.charAt(i-k) == 'W'){
                curr--;
             }

              if(blocks.charAt(i) == 'W'){
                curr++;
            }
            minop = Math.min(minop,curr);
           }
           return minop;
        
    }
}