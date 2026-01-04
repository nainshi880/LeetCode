class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] right = new int[nums.length];
        int pro = 1;
        for(int i= nums.length-1;i>0;i--){
            pro = pro*nums[i]; 
            right[i] = pro;
        }
        int[] ans = new int[nums.length];

        int left = 1;
        for(int i=0;i<nums.length-1;i++){
            int val = left*right[i+1];
            ans[i] = val;
            left = left*nums[i];
        }
        ans[nums.length-1] = left;
        return ans;
    }
}