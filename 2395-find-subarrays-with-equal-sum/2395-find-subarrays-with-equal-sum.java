class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i=1;i<n;i++){
            int sum = nums[i]+nums[i-1];
            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}