class Solution {
    public int mirrorDistance(int n) {
        int rev = 0;
        int or = n;
        while(n >0){
            int r = n%10;
            rev = 10*rev + r;
            n = n/10;
        }
        int diff = Math.abs(rev - or);
        return diff;
    }
}