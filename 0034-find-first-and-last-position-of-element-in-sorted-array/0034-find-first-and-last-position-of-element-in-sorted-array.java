class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        result[0] =  firstOccurence(nums, target);
        result[1] =  findLast(nums,target);
        return result;
    }

    private int firstOccurence(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(low <= high){
             int mid = (low+high)/2;
            if(nums[mid] == target){
               ans = mid;
               high = mid - 1;
            }else if(nums[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    private int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                ans = mid;
                low = mid + 1;   
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}