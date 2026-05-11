class Solution {
    public int alternateDigitSum(int n) {
        int c = String.valueOf(n).length();
        int arr[]=new int[c];
        int k=c-1;
        while(n>0){
            int last=n%10;
            arr[k]=last;
            k--;
            n=n/10;
        }

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