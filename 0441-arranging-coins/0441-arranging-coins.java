class Solution {
    public int arrangeCoins(int n) {
        long l =0;
        long h = n;
        long ans = 0;
        while(l<=h){
            long k = l + (h-l)/2;
            long m = k*(k+1)/2;
            if(m == n){
                return (int)k;
            }else if(m >n){
                h = k-1;
            }else{
                ans = k;
                l = k+1;
            }
        }
        return (int)ans;
    }
}