class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       
        int ans = numBottles;
        int count =0;
        while(numBottles >= numExchange){
            int newBottles = numBottles / numExchange;
            int remain = numBottles%numExchange;
            ans += newBottles;
            numBottles = newBottles + remain; 
        }
        return ans;
    }
}