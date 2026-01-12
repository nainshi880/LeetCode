class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int n : nums) seen.add(n);

        int max = 0;
        for(int n : seen) {
            if(seen.contains(n - 1)) continue; 
            int count = 1;
            int tmp = n + 1;
            while(seen.contains(tmp++)) count++;
            max = Math.max(max, count);
        }
        return max;
    }
}