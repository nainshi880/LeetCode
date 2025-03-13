class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int l = 0, r = queries.length, ans = -1;
        while(l <= r){
            int m = (l+r)/2;
            if (canMakeZero(nums.clone(), queries, m)) {
                ans = m;
                r = m - 1; 
            } else {
                l = m + 1;
            }
        }
        return ans;
    }

     private static boolean canMakeZero(int[] nums, int[][] queries, int k) {
        int n = nums.length;
        int[] diff = new int[n + 1];
        for (int i = 0; i < k; i++) {
            int li = queries[i][0], ri = queries[i][1], vali = queries[i][2];
            diff[li] -= vali;
            diff[ri + 1] += vali;
        }
         for (int i = 0, runningSum = 0; i < n; i++) {
            runningSum += diff[i];
            nums[i] += runningSum;
            if (nums[i] > 0) return false;
        }
        return true; 
     }
}