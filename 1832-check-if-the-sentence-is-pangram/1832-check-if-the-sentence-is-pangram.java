class Solution {
    public boolean checkIfPangram(String sent) {
        int n = sent.length();
        if(n < 26) return false;
        for(char c='a';c<='z';c++){
            if(sent.indexOf(c) < 0){
                return false;
            }
        }
        return true;
    }
}