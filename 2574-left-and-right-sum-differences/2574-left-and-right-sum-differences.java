class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        if(n== 1) return new int[]{0};

        int[] l = new int[n];
        int[]r = new int[n];
          int lSum = 0;
          int rSum = 0;
        for(int i=0;i<n;i++){  
           l[i] = lSum;
           lSum += nums[i];
        }

        for(int i=n-1;i>=0;i--){
            r[i] = rSum;
            rSum += nums[i];
        }
        for(int i=0;i<n;i++){
            int diff = Math.abs(l[i] - r[i]);
            ans[i] = diff;
        }
        return ans;
    }
}