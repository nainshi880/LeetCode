class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
         int prefix = 0;
        int count = 0;
        for(int n: nums){
            prefix += n;

            if(map.containsKey(prefix - goal)){
                count += map.get(prefix - goal);
            }
            map.put(prefix, map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}