class Solution {
    public int duplicateNumbersXOR(int[] arr) {
        int xor = 0;
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
           if((arr[i]^arr[i-1]) == 0){
         xor ^= arr[i];
           } 
        }
        return xor;
    }
}