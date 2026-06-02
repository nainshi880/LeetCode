class Solution {
    public int earliestFinishTime(int[] LST, int[] LD, int[] WST, int[] WD) {
        int l = Integer.MAX_VALUE;
        int w = Integer.MAX_VALUE;
        for(int i=0;i<LST.length;i++){
                l = Math.min(l,(LST[i]+LD[i]));
        }
        for(int i=0;i<WST.length;i++){
                w = Math.min(w,(WST[i]+WD[i]));
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<WST.length;i++){
            if(WST[i] < l){
                ans = Math.min(ans,l+WD[i]);
            }else{
                ans = Math.min(ans,WST[i]+WD[i]);
            }
        }
            for(int i=0;i<LST.length;i++){
                if(LST[i] < w){
                    ans = Math.min(ans,w+LD[i]);
                }else{
                    ans = Math.min(ans,LST[i]+LD[i]);
                }
            }
        

        return ans;

    }
}