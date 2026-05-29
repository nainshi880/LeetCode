class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;

        for(int i=0;i<n;i++){
            int sum = 0;
            while(nums[i] > 0){
                int rem = nums[i]%10;
                sum += rem;
                nums[i] /= 10;
                System.out.println(sum);
            }
            nums[i] = sum;
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(min,nums[i]);
        }
        return min;
    }
}