class Solution {
     int[] result;
    boolean[] used;
    int n;

    public int[] constructDistancedSequence(int n) {
        this.n = n;
        result = new int[2 * n - 1];
        used = new boolean[n + 1];

        backtrack(0);
        return result;
    }
    private boolean backtrack(int idx){
        if (idx == result.length) return true;
        if(result[idx] != 0) return backtrack(idx+1);

         for (int num = n; num >= 1; num--){
            if (used[num]) continue;

            if(num == 1){
                result[idx] = 1;
                used[1] = true;
            
              if (backtrack(idx + 1)) return true;
               result[idx] = 0;
                used[1] = false;
            }else{
                int j = idx+num;
                 if (j < result.length && result[j] == 0){
                    result[idx]= num;
                    result[j] = num;
                    used[num] = true;
                      if (backtrack(idx + 1)) return true;
                       result[idx]= 0;
                    result[j] = 0;
                    used[num] = false;
                 }
            }
        }
        return false;
    }
}