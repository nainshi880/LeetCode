class Solution {
    public int maximumJumps(int[] nums, int t) {
        int n = nums.length;
        int[] memo = new int[n];

        Arrays.fill(memo,Integer.MIN_VALUE);
        int max = dfs(0,nums,t,memo);

        return max < 0 ? -1: max ;
    }
    private int dfs(int i,int[] nums,int t,int[] memo){
        int n = nums.length;
        if(i == n-1) return 0;
        if(memo[i] != Integer.MIN_VALUE) return memo[i];

        int ans = Integer.MIN_VALUE;
        for(int j=i+1;j<n;j++){
            if(Math.abs(nums[i] - nums[j]) <= t){
                ans = Math.max(ans,dfs(j,nums,t,memo)+1);
            }
        }
        return memo[i] = ans;
    }
}