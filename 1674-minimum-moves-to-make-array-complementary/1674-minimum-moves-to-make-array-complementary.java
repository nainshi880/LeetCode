class Solution {
    public int minMoves(int[] nums, int limit) {
        int n = nums.length;
          int[] diff = new int[2 * limit + 2];

        for(int i = 0; i < n / 2; i++){
            int a = nums[i];
            int b = nums[n - 1 - i];

            int small = Math.min(a, b);
            int large = Math.max(a, b);
            int sum = a + b;

            diff[2] += 2;
            diff[2 * limit + 1] -= 2;

            diff[small + 1] -= 1;
            diff[large + limit + 1] += 1;

            diff[sum] -= 1;
            diff[sum + 1] += 1;
        }

        int ans = Integer.MAX_VALUE;
        int curr = 0;

        for(int t = 2; t <= 2 * limit; t++){
            curr += diff[t];
            ans = Math.min(ans, curr);
        }

        return ans;
    }
}