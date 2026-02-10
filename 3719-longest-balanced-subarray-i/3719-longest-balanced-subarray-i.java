class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;

         int maxLen = 0;
        for(int j=0;j<n;j++){

             HashSet<Integer> even = new HashSet<>();
            HashSet<Integer> odd = new HashSet<>();
            for(int i=j;i<n;i++){
            if(nums[i]%2 == 0){
                even.add(nums[i]);
            }else{
               odd.add(nums[i]);
            }
              if(even.size() == odd.size()){
                maxLen = Math.max(maxLen, i-j+1);
              }
        }
        }
           
        return maxLen;
    }
}