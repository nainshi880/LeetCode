class Solution {
    public boolean wordPattern(String pattern, String s) {
          String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
         Map<Character, String> w = new HashMap<>();
        Map<String, Character> c = new HashMap<>();
        for(int i =0;i< pattern.length();i++){
            char ch = pattern.charAt(i);
            String word = words[i];
            if(w.containsKey(ch)){
                if(!w.get(ch).equals(word)){
                    return false;
                }
                }else{
                    if(c.containsKey(word)){
                        return false;
                    }
                     w.put(ch, word);
                c.put(word, ch);
                }
            }
            return true;
        
    }
}