class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;

       if(n == 1) return 0;

       int s = 0;
       while(nums[s] != 0){
        s++;
       }
       boolean asc = true;
       boolean desc = true;

       for(int i=1;i<n;i++){
        final int val = nums[(i+s)% n];

        if(val != i){
            asc = false;
        }

        if(val != n-i){
            desc = false;
        }

        if(!asc && !desc){
            return -1;
        }
       }

       if(asc) return Math.min(s,n-s+2);

       return Math.min(n-s, s+2);
            
        
    }
}