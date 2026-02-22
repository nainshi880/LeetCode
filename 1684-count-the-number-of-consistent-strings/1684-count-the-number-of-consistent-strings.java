class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] ok = new boolean[26];
        for(char ch : allowed.toCharArray()){
            ok[ch-'a'] = true;
        }
        int count = 0;
        for(String word : words){
            boolean valid = true;
            for(char ch : word.toCharArray()){
                if(!ok[ch-'a'] == true){
                    valid = false;
                    break;
                }
            }
            if(valid) count++;
        }
        return count;
    }
}