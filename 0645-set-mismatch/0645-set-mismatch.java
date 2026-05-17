class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int i = 0;
       while(i < n){
            int c = nums[i]-1;
            if(nums[c] != nums[i]){
                swap(nums,c,i);
            }else{
               i++;
            }
        }

        int[] ans = new int[2];
        for(int j=0;j<n;j++){
            if(nums[j] != j+1){
                ans[0] = nums[j];
                ans[1] = j+1;
            }
        }
        return ans;
    }
    void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}