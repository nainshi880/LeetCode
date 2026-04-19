class Solution {
    public int smallestEvenMultiple(int n) {
        int min = Integer.MAX_VALUE;
         for(int i=1;i<=n;i++){
            if(i%2 == 0 && i%n == 0){
                min = Math.min(min,i);
            }else{
                min = n*2;
            }
         }
         return min;
    }
}