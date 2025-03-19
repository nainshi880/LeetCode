class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int flip = 0;
        for(int i =0;i<= n-3;i++){
            if(nums[i] == 0){
                for (int j = 0; j < 3; j++) {
                nums[i + j] ^= 1;
                }
                flip++;
            }

        }
        for (int num : nums) {
            if (num == 0) {
                return -1;
            }
        }
        return flip;
    }
}