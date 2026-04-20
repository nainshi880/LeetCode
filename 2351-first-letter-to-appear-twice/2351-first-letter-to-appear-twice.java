class Solution {
    public char repeatedCharacter(String s) {
        int n = s.length();
       Set<Character> set = new HashSet<>();
       for(char ch : s.toCharArray()){
            if(set.contains(ch)) return ch;
            set.add(ch);
       }
       return 'a';
    }
}