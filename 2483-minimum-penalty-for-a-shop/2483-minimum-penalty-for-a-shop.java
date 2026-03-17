class Solution {
    public int bestClosingTime(String c) {
      int y=0;
        for(int i=0;i<c.length();i++){
            if(c.charAt(i) == 'Y'){
                y ++;
            }
        }
             int penalty = y;
             int minPenalty = penalty;
             int ans = 0;
             for(int i=0;i<c.length();i++){
            if(c.charAt(i) == 'Y'){
                penalty--;
            }else{
                penalty++;
            }

            if(penalty < minPenalty){
                minPenalty = penalty;
                ans = i+1;
            }
             }
        
        return ans;
        
    }
}