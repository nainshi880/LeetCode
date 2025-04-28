class Solution {
    public int findLHS(int[] nums) {
         Map<Integer, Integer> freq = new HashMap<>();
        int longest = 0;

        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for(int num : freq.keySet()){
            if(freq.containsKey(num + 1)){
                 int len = freq.get(num) + freq.get(num + 1);
                 longest = Math.max(longest, len);
            }
        }
        return longest;
    }
}