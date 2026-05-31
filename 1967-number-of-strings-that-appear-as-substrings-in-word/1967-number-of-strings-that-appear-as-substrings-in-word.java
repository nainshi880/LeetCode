class Solution {
    public int numOfStrings(String[] pat, String w) {
        int count = 0;

        for(String p : pat){
            if(w.contains(p)){
                count++;
            }
        }
        return count;
    }
}