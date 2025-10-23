class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        long exp = n; 
        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }

        if (exp % 2 == 0) {
            double half = myPow(x, (int) (exp / 2));
            return half * half;
        } else {
            return x * myPow(x, (int) (exp - 1));
        }
    }
}