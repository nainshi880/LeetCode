class Solution {
    public int[] sortedSquares(int[] nums) {
      int[] ans = new int [nums.length];
       int start = 0;
       int end = nums.length -1;
       int ptr = nums.length -1;
        while(start <= end){
            int startSq = nums[start]*nums[start];
            int endSq = nums[end]*nums[end];

            if(startSq < endSq){
                ans[ptr] = endSq;
                end--;
            }else{
                ans[ptr] = startSq;
                start++;
            }
            ptr--;
        }
       return ans;
    }
}