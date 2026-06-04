class Solution {

    private int wave(int x){
        String s = Integer.toString(x);

        int c = 0;

        for(int i=1;i<s.length()-1;i++){
            char cur = s.charAt(i);
            if ((cur > s.charAt(i - 1) && cur > s.charAt(i + 1)) ||
                (cur < s.charAt(i - 1) && cur < s.charAt(i + 1))) {
                c++;
            }
        }
        return c;
    }
    public int totalWaviness(int num1, int num2) {
        int count = 0;

        for(int i=num1;i<= num2;i++){
           count += wave(i);
        }
        return count;
    }
}