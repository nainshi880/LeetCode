class Solution {
    public int findKthPositive(int[] arr, int k) {
        int miss = 0;
        int curr = 1;
        int i =0;
        while(miss < k){
            if(i < arr.length && arr[i] == curr ){
                i++;
            }else{
                miss++;
                if(miss == k){
                    return curr;
                }
            }
            curr++;
        }
        return curr;
    }
}