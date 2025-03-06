class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
         int n = grid.length;
        int size = n * n;
        Set<Integer> expNumbers = new HashSet<>();
        for (int i = 1; i <= size; i++) {
            expNumbers.add(i);
        }
        
        Map<Integer, Integer> countMap = new HashMap<>();
        int repeat = -1, miss = -1;

        for(int[] row : grid){
            for(int num: row){
                countMap.put(num,countMap.getOrDefault(num,0) +1);
                if(countMap.get(num) == 2){
                    repeat = num;
                }
            }
        }
        for(int i=1;i<= size;i++){
            if(!countMap.containsKey(i)){
                miss = i;
                break;
            }
        }
        return new int[]{repeat,miss};
    }
}