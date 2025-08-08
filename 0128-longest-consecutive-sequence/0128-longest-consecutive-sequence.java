class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int longest = 1;
        HashSet<Integer> st = new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(nums[i]);

        }
        for(int it : st){
            if(!st.contains(it - 1)){
               int currentNum = it;
                int streak = 1;
                 while (st.contains(currentNum + 1)) {
                    currentNum++;
                    streak++;
                }
               longest = Math.max(longest,streak);
            }

        }
        return longest;
    }
}