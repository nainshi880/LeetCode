class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int currSum = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]+currSum > nums[i]){
                currSum += nums[i]; 
            }else{
                currSum = nums[i];
            }
            max = Math.max(currSum,max);
        }
        return max;
    }
}