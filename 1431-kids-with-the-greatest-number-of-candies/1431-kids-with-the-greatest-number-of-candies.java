class Solution {
    public List<Boolean> kidsWithCandies(int[] can, int ex) {
        int n = can.length;

        List<Boolean> ans = new ArrayList<>();
             int max = 0;
        for(int i=0;i<n;i++){
           max = Math.max(max,can[i]);
        }

        for(int i=0;i<n;i++){
            if(can[i]+ ex >= max){
                ans.add(true);
            }else{
                ans.add(false);
            }

        }
        return ans;
    }
}