class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        
        // long ways = 0;
        // long penCost = 0;
        // while(penCost <= total){
        //     long remain = total - penCost;
        //     long pencil = remain/cost2 +1;
        //     ways += pencil;
        //     penCost += cost1;
        // }
        // return ways;

            long ways = 0;
        long remain = total;
        
        if(cost1 <= cost2){
            while(remain >= 0){
                ways += (remain/cost1)+1;
                remain -= cost2;
            }
        }else{
            while(remain >= 0){
                ways += (remain/cost2)+1;
                remain -= cost1;
            }
        }
        return ways;
        
    }
}