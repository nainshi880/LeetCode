class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int current = 0;
        for(int i =0; i<nums.length;i++){
            current += nums[i];
        }
        sum = nums.length*(nums.length + 1)/2;
        int miss = sum - current;
        return miss;
        
    }
}