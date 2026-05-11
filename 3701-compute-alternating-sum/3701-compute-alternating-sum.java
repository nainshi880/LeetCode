class Solution {
    public int alternatingSum(int[] arr) {
         int sum1=0;
        int sum2=0;

        for(int i=0;i<arr.length;i=i+2){
            sum1+=arr[i];
        }

        for(int i=1;i<arr.length;i=i+2){
            sum2-=arr[i];
        }
        return sum1+sum2;
    }
}