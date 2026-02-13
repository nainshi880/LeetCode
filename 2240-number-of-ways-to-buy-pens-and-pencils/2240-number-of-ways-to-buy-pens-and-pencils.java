class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        
        long ways = 0;
        long penCost = 0;
        while(penCost <= total){
            long remain = total - penCost;
            long pencil = remain/cost2 +1;
            ways += pencil;
            penCost += cost1;
        }
        return ways;
        
    }
}