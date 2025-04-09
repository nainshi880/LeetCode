class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        int ops =0;
        int last = -1;
         for (int num : nums) {
            if (num < k) return -1;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] <= k) break; 

            if (nums[i] != last) {
                ops++;        
                last = nums[i];
            }
        }

        return ops;
    }

    }
