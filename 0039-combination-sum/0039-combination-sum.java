class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
         backtrack(result,0,target, new ArrayList<>(), candidates);
        return result;
        
    }
    private void  backtrack(List<List<Integer>> result, int start, int remain, List<Integer> tempList, int[] candidates){
        if(remain <0)return;
        if(remain == 0){
            result.add(new ArrayList<>(tempList));
            return;
        }
        for(int i = start;i<candidates.length;i++){
            tempList.add(candidates[i]);
            backtrack(result,i,remain - candidates[i],tempList,candidates);
             tempList.remove(tempList.size() - 1);
    }
    }
}