class Solution {
    public int[] createTargetArray(int[] nums, int[] in) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();    
       int[] ans = new int[n];
       for(int i=0;i<nums.length;i++){
        
            arr.add(in[i],nums[i]);
        }
        for(int i=0;i<n;i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}