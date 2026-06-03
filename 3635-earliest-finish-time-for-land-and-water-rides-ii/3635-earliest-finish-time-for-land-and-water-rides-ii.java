class Solution {
    public int earliestFinishTime(int[] LST, int[] LD, int[] WST, int[] WD) {
        int n = LST.length;
        int m = WST.length;
       int minL = Integer.MAX_VALUE;
        int minW = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            minL = Math.min(minL,LST[i]+LD[i]);
        }

        for(int i=0;i<m;i++){
            minW = Math.min(minW,WST[i]+WD[i]);
        }

        int ans = Integer.MAX_VALUE;

        for(int i=0;i<m;i++){
            if(WST[i] < minL){
                ans = Math.min(ans,minL+WD[i]);
            }else{
                ans = Math.min(ans,WST[i]+WD[i]);
            }
        }

        for(int i=0;i<n;i++){
            if(LST[i] < minW){
                ans = Math.min(ans,minW+LD[i]);
            }else{
                ans = Math.min(ans,LST[i]+LD[i]);
            }
        }
         return ans;
        
    }
}