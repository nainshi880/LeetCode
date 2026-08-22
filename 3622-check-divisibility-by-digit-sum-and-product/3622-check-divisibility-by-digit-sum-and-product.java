class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int mul = 1;
        int nums = n;
        while(nums > 0){
            int d = nums%10;
            sum += d;
            mul *= d;
            nums = nums/10;
        }
        int total = sum + mul;
        return n%total == 0;
    }
}