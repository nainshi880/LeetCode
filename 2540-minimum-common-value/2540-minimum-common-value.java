class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
       int min = Integer.MAX_VALUE;

       Set<Integer> set = new HashSet<>();
       for(int i=0;i<m;i++){
        set.add(nums1[i]);
       }

       for(int j=0;j < n;j++){
        if(set.contains(nums2[j])){
            min = Math.min(min,nums2[j]);
        }
       }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}