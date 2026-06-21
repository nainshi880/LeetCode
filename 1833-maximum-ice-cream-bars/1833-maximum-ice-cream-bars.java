class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        // if(coins < costs[0]) return 0;
        int n = costs.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if((coins- costs[i]) >= 0){
             coins = coins - costs[i];
             count ++;
            }

        }
        return count;
    }
}