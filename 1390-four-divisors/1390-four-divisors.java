class Solution {
    public int sumFourDivisors(int[] nums) {
        int total = 0;
        for(int n : nums){
        int count = 0;
        int sum = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
                int other = n/i;
                count++;
                sum += i;
                if(other != i){
                    count++;
                        sum += other;
                }
                if(count > 4) break;
            }
            
        }
        if(count == 4){
            total += sum;
        }
       
        }
         return total;
    }
}