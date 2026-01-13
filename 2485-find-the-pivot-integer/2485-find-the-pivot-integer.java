class Solution {
    public int pivotInteger(int n) {
         int right = n*(n+1)/2;
       int[] arr = new int[n];
       for(int i=0;i<n;i++){
        arr[i] = i+1; 
       }
        int left = 0;
        for(int i=0;i<n;i++){
            right -= arr[i];
            if(left == right){
                return arr[i];
            }
            left += arr[i];
        }
        return -1;
    }
}