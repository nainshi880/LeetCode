class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int total = 0;
       for(int i=0;i<n;i++){
        int[] freq = new int[26]; 

        for (int j = i;j<n;j++) {
            char c = s.charAt(j);
            freq[c - 'a']++;
        
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       for(int f : freq){
        if(f >0 ){
            max = Math.max(max,f);
            min = Math.min(min,f);

        }
     }
       total += (max - min); 
       }
    }
       return total;
    }
}