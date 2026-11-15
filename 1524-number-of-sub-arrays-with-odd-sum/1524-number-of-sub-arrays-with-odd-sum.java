class Solution {
    public int numOfSubarrays(int[] nums) {
        int n = nums.length;
         int cntEv = 0;
        int cntOdd = 0;
        int ans = 0;
        int pre = 0;

        int mod = (int)1e9 + 7;
        for(int i=0;i<n;i++){
            pre += nums[i];
             if((pre&1) == 0){ 
                ans = (ans + cntOdd) % mod;
                cntEv++;
            }else{
                ans = (ans + cntEv) % mod;
                ans++;
                cntOdd++;
            }
        }
        return ans;
    }
}