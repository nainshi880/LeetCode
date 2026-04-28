class Solution {
    public int hIndex(int[] c) {
       int n = c.length;
       int[] b = new int[n+1];
       for(int i =0;i<n;i++){
        int x = c[i];
        if(x >= n){
            b[n]++;
        }else{
            b[x]++;
        }
       }
       int count = 0;
       for(int i=n;i>0;i--){
        count += b[i];
        if(count >= i){
            return i;
        }
       } 
       return 0;
    }
}