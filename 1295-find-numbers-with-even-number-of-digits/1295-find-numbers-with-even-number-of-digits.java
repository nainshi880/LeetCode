class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++){  
            int d = 0;
        while(nums[i] > 0){
            int r = nums[i]%10;
            d++;
             nums[i] /= 10;
        }
        if(d%2 == 0){
            count++;
        }
        }
        return count;
    }
}