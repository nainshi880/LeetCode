class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
         Set<Character> set = new HashSet<>();
        for(int i=0;i<n;i++){
            char ch = word.charAt(i);
             if(ch >= 'A' && ch <= 'Z'){
                for(int j=0;j<n;j++){
                    if(ch + 32 == word.charAt(j)){
                        set.add(ch);
                    }
                }
             }
        }
        return set.size();
    }
}