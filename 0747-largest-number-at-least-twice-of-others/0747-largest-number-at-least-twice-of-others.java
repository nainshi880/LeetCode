class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int smax = -1;
        int idx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                smax = max;
                max = nums[i];
                idx = i;
            }else if(nums[i] > smax){
                smax = nums[i];
            }
        }
        if(smax*2 <= max){
            return idx;
        }
        return -1;
    }
}