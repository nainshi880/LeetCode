class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
          int[] ans = merge(nums1,nums2);
          int n = ans.length;
          if(n % 2 == 0){
            double answer = (double)(ans[n /2] + ans[(n-1)/2])/2;
            return answer;
          }else{
            double answer = (double)(ans[ans.length/2]);
            return answer;
          }
    }
    public int[] merge(int[] nums1,int[] nums2){
        int []ans = new int[nums1.length + nums2.length];
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        while(p1 < nums1.length || p2< nums2.length){
         int val1 = p1 <nums1.length ? nums1[p1] : Integer.MAX_VALUE;
         int val2 = p2 <nums2.length ? nums2[p2] : Integer.MAX_VALUE;
            if(val1 < val2){
                ans[p3] = val1;
                p1++;
            }else{
                ans[p3] = val2;
                p2++;
            }
           p3++;
        }
        return ans;
    }
}