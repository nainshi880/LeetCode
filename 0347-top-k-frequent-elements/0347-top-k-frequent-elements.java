class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
         for(int n : nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
         }
         List<Integer> [] list = new List[nums.length + 1];
         for(int key : freq.keySet()){
             int f = freq.get(key);
             if(list[f] ==  null){
                list[f] = new ArrayList<>();
             }
             list[f].add(key);
         }
           int[] result = new int[k];
        int idx = 0;
         for (int i = list.length - 1; i >= 0 && idx < k; i--) {
            if (list[i] != null) {
                for (int val : list[i]) {
                    result[idx++] = val;
                    if (idx == k) break;
                }
            }
        }
        return result;
    }
}