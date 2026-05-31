class Solution {
    public boolean asteroidsDestroyed(int mass, int[] ast) {
        Arrays.sort(ast);
        long curr = mass;

        for(int a : ast){
            if(a > curr){
                return false;
            }
            curr += a;
        }
        return true;
    }
}