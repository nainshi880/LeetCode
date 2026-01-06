class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxEnd = 0, maxSum = 0;
        int minEnd = 0, minSum = 0;
       
       for(int n : nums){
        maxEnd = Math.max(n,n + maxEnd);
        maxSum = Math.max(maxEnd, maxSum);

        minEnd = Math.min(n,n + minEnd);
         minSum = Math.min(minEnd,minSum);
       }
       return Math.max(maxSum,Math.abs(minSum));
    }
}