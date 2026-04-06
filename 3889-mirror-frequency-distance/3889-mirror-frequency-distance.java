class Solution {
    public int mirrorFrequency(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int diff = 0;
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
         HashSet<Character> v = new HashSet<>();
        int ans = 0;
        for(char c : map.keySet()){
            if(v.contains(c)){
                continue;
            }
             char m;
            if (c >= 'a' && c <= 'z') {
                m = (char) ('z' - (c - 'a'));
            } else {
                m = (char) ('9' - (c - '0'));
            }

            int f1 = map.getOrDefault(c,0);
            int f2 = map.getOrDefault(m,0);

            ans += Math.abs(f1-f2);
               v.add(c);
               v.add(m);
        }
        return ans;
    }
}