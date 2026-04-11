class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
          if(n < 3) return -1;
         HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int ans = Integer.MAX_VALUE;
        for(ArrayList<Integer> list : map.values()){
            for(int i=0;i+2<list.size();i++){
                int dist = 2*(list.get(i+2) - list.get(i));
                ans = Math.min(ans,dist);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}