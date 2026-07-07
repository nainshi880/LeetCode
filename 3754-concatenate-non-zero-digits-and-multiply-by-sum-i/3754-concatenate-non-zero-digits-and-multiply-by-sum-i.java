class Solution {
    public long sumAndMultiply(int n) {

        long sum = 0;
        long num = 0;
        long place = 1;
        while(n > 0){
             int r = n%10;
             if(r != 0) {
                num = r*place  + num;
                place *= 10;
                 sum += r;
             }
             n /= 10;
        }
        return sum*num;
    }
}