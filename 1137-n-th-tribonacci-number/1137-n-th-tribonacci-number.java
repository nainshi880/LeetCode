class Solution {
    public int tribonacci(int n) {

        if(n == 0){
            return 0;
        }else if(n== 1 || n==2){
            return 1;
        }else{
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
       

        for(int i= 1;i<=n;i++){
        int   t3 = t0+t1+t2;
            t0 = t1;
            t1 = t2;
            t2 = t3;
        }
        
      return t0;
        }
    }
}