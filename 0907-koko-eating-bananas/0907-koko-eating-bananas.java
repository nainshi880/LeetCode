class Solution {
    public int minEatingSpeed(int[] piles, int h) {
           int left = 1;
        int right = getMax(piles);
        int ans = right;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(canEatAll(piles, mid, h)){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }

    private boolean canEatAll(int []piles, int k, int h){
       int hours = 0;
       for(int pile : piles){
        hours += Math.ceil((double) pile / k);
        if(hours > h)return false;
       }
       return hours<=h;

    }
     private int getMax(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }

}