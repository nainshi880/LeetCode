class Solution {
    public int maxDistance(int[] c) {
       int n = c.length;
       int ans = Integer.MIN_VALUE;

       for(int i=0;i<n;i++){
        if(c[i] != c[0]){
            ans = Math.max(ans,i);
        }
        if(c[n-1] != c[i]){
            ans = Math.max(ans,n-1-i);
        }
       }
       return ans;
    }
}