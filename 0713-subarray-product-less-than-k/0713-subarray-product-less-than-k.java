class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       if(k <= 1) return 0;
        int n = nums.length;
       int left = 0;
        int count = 0;
        int prod = 1;
        for(int i=0;i<n;i++){
          prod = prod*nums[i];
            while(prod >= k){
                prod /= nums[left];
                left++;
            }
            count += i-left+1;
        }
        return count;
    }
}