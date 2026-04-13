class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int diff = 0;
        if(nums[0] == target && start == 0 ) return 0;
        for(int i=0;i<n;i++){
            if(nums[i] == target) {
               diff = Math.abs(i - start);
              min = Math.min(min, diff);
            }
        }
       
        return min;
    }
}