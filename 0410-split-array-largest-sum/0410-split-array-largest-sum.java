class Solution {
    public int splitArray(int[] nums, int k) {
        int s = 0, e = 0;

        for(int num : nums){
            s = Math.max(s, num);
            e += num;
        }

        while(s < e){

            int m = s + (e - s) / 2;

            int sum = 0;
            int pieces = 1;

            for(int num : nums){

                if(sum + num > m){
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }

            if(pieces > k){
                s = m + 1;
            }else{
                e = m;
            }
        }

        return s;
    }
}