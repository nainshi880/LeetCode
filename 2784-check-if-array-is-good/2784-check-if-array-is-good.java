class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        for(int i=0;i<n;i++){
            max = Math.max(nums[i],max);
        }
        if((max+1) != n) return false;
        
        int[] freq = new int[max + 1];

         for (int x : nums) {
            if (x < 1 || x > max)
                return false;

            freq[x]++;
        }

        for (int i = 1; i < max; i++) {

            if (freq[i] != 1)
                return false;
        }

        return freq[max] == 2;
    }
}