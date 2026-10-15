class Solution {
    public boolean search(int[] nums, int t) {
        int n = nums.length;

        int l = 0;
        int h = nums.length-1;

        while(l <= h){
            int mid = l + (h-l)/2;
            
            if(nums[mid] == t){
                return true;
            }
            if (nums[l] == nums[mid] && nums[mid] == nums[h]) {
                l++;
                h--;
            }
             else if(nums[l] <= nums[mid]){
                if(nums[l] <= t && nums[mid] > t){
                    h = mid-1;
                }else{
                    l = mid+1;
                }
            }else{
                if(nums[h] >= t && nums[mid] < t){
                    l = mid+1;
                }else{
                    h = mid-1;
                }
            }
        }
        return false;
    }
}