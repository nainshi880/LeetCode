class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int x: nums){
            xor ^= x;
        }
        int mask = (xor&(xor-1))^xor;
        int b1= 0, b2 = 0;
       for(int x : nums){
        if((x & mask)!= 0) b1 ^=x;
        else b2 ^= x;
       }
       int[] arr = {b1,b2};
       Arrays.sort(arr);
       return arr;
    }
}