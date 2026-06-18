class Solution {
    public double angleClock(int hr, int min) {
        double deg = 0;
        deg = Math.abs(5.5*min - 30*hr);
         
        return Math.min(deg,(360 - deg));
    }
}