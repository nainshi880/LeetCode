class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int count = 0;
        int n = colors.length;
         if(k>n) return 0;
         int valid = 1;
         for(int i=1;i<n + k-1;i++){
            int pre = colors[(i-1)%n];
            int curr = colors[i%n];
            if(pre != curr){
                valid++;
            }else{
                valid = 1;
            }
            if(valid == k){
                count++;
                valid--;

            }
           
         }
        return count;
    }
}