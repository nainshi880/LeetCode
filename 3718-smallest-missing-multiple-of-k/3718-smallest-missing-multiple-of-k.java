class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int x = k;
        for (int i=0;i<n;i++) {
            if (nums[i] == x) x += k;
        }
        return x;
    }
}