class Solution {
    public String frequencySort(String s) {
        int n = s.length();

        Map<Character, Integer> freq = new HashMap<>();

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }

        List<Character> sorted = new ArrayList<>(freq.keySet());

        sorted.sort((c1,c2) -> freq.get(c2) - freq.get(c1));


         StringBuilder result = new StringBuilder();
        for (char c : sorted) {
            result.append(String.valueOf(c).repeat(freq.get(c)));
        }
        
        return result.toString();
    }
}