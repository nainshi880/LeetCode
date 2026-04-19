class Solution {
    public int smallestDivisor(int[] nums, int th) {
         int max = 0;
        for(int ele : nums){
            max = Math.max(ele, max);
        }

        int l = 1, hi = max;
        int ans = max;

        while(l <= hi){
            int mid = l + (hi - l) / 2;

            if(hours(mid, nums) <= th){
                ans = mid;
                hi = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    private long hours(int d, int[] arr){
        long total = 0;

        for(int ele : arr){
            total += (ele + d - 1L) / d;
        }

        return total;
    }
}