class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
         int ans = Integer.MAX_VALUE;
     if( n < 3) return -1;
        for(int i=0;i<n;i++){
            int count = 1;
           for(int j=i+1;j<n;j++){
            if(nums[i] == nums[j]) count++;
            if(count == 3) {
               int diff = 2*(j-i);
               ans = Math.min(diff,ans);
               break;
            }
           }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}