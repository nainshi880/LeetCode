class Solution {
    public List<Integer> solveQueries(int[] nums, int[] q) {
        int n = nums.length;

        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        List<Integer> ans = new ArrayList<>();

        for(int qi : q){
            List<Integer> list = map.get(nums[qi]);

            if(list.size() == 1){
                ans.add(-1);
                continue;
            }

            int pos = Collections.binarySearch(list, qi);

            int left = (pos - 1 + list.size()) % list.size();
            int right = (pos + 1) % list.size();

            int d1 = Math.abs(list.get(left) - qi);
            int d2 = Math.abs(list.get(right) - qi);

            int dist1 = Math.min(d1, n - d1);
            int dist2 = Math.min(d2, n - d2);

            ans.add(Math.min(dist1, dist2));
        }

        return ans;
    }
}