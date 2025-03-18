class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left = 0;
        int andMask = 0;
        int maxLen = 0;
        for(int right =0;right < nums.length;right++){
        while((andMask & nums[right]) != 0){
            andMask ^= nums[left];
            left++;
        }

        andMask |= nums[right];
        maxLen = Math.max(maxLen, right - left +1);
        }
        return maxLen;

    }
}