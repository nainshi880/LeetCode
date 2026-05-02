class Solution {
    public int rotatedDigits(int n) {
        if(n == 1) return 0;
        int count = 0;
        for(int i = 1;i<=n;i++){
           int num = i;
           Boolean v = true;
           Boolean ch = false;

           while(num > 0){
            int r = num%10;
            if(r == 3 || r == 4 || r == 7){
                v = false;
                break;
            }

            if(r == 2 || r == 5 || r == 6 ||r == 9 ){
                ch = true;
            }
            num /= 10;
           }
           if(v && ch) count++;
        }
        return count;
    }
}