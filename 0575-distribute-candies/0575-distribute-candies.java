class Solution {
    public int distributeCandies(int[] c) {
        int n = c.length;
        int num = n/2;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
           set.add(c[i]);
        }
        return Math.min(set.size(),num);
    }
}