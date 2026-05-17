class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
       while(i < n){
            int c = nums[i]-1;
            if(nums[i] >0 && nums[i] <= nums.length && nums[c] != nums[i]){
                swap(nums,c,i);
            }else{
               i++;
            }
        }
    for(int j=0;j < n;j++){
        if(nums[j] != j+1){
            return j+1;
        }
    }
        return nums.length + 1;
    }
    void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}