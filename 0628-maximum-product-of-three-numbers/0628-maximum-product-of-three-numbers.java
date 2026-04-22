class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
       
        for(int i=0;i<n;i++){
            max = Math.max(nums[n-1]*nums[n-2]*nums[n-3],nums[0]*nums[1]*nums[n-1]);

        }
        return max;
    }
}