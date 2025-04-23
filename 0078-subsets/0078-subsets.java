class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(0,nums,new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int start, int[] nums, List<Integer> cur, List<List<Integer>> result)
{
    result.add(new ArrayList<>(cur));

    for(int i= start; i< nums.length;i++){
        cur.add(nums[i]);
        backtrack(i + 1,nums, cur, result);
        cur.remove(cur.size() - 1);
    }
}
}