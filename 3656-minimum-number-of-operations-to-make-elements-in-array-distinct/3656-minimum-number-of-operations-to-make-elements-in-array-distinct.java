class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int ops = 0;
        while(ops*3 <= n){
           Set<Integer> seen = new HashSet<>();
            boolean isDistinct = true;
            for (int i = ops * 3; i < n; i++) {
                if (!seen.add(nums[i])) {
                    isDistinct = false;
                    break;
                }
            }
            if(isDistinct){
                return ops;
              
            }
              ops++;
        }
        return ops;
    }
}