class Solution {
    // static int[] dp;
     public int rob(int[] nums) {
        int n = nums.length;
    if(n == 0) return 0;
    if(n == 1) return nums[0];
    if(n == 2) return Math.max(nums[0], nums[1]);
    
      int var1 = nums[0];
      int var2 = Math.max(nums[0],nums[1]);
       int money = 0;
      for(int i=2;i<n;i++){
          money = Math.max(var2, nums[i] + var1);
          var1 = var2;
          var2 = money;
      }
      return money;
     }
}