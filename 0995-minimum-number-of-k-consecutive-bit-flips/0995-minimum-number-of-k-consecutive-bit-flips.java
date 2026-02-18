class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int f = 0;
        int ans = 0;
        int[] flipped = new int[n];
       for(int i=0;i<n;i++){
        if(i >= k){
            f ^= flipped[i-k];
        }
        if(nums[i] == f){
                if (i + k > n) return -1;
                ans++;
                f ^= 1;
                flipped[i] = 1;
        }
       }
       return ans;
    }
}