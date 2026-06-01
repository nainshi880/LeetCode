class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        Arrays.sort(cost);
        int p = 0;
            if(n == 1){
                return cost[0];
            }
            if(n == 2){
                return cost[0]+cost[1];
            }
        for(int i=n-1;i>=0;i-= 3){
             p += cost[i];
             if(i-1 >=0){
                p += cost[i-1];
             }
        }
        return p;
    }
}