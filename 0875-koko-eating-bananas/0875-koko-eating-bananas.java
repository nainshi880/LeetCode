class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int max = 0;
        for(int ele : piles){
            max = Math.max(ele, max);
        }

        int l = 1, hi = max;
        int ans = max;

        while(l <= hi){
            int mid = l + (hi - l) / 2;

            if(hours(mid, piles) <= h){
                ans = mid;
                hi = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    private long hours(int speed, int[] arr){
        long hour = 0;

        for(int ele : arr){
            hour += (ele + speed - 1L) / speed;
        }

        return hour;
    }
}