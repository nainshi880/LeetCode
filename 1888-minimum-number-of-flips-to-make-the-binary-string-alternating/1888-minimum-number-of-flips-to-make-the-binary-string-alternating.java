class Solution {
    public int minFlips(String s) {
      int n = s.length();
      String s2 = s+s;
      int diff1 = 0, diff2 = 0;
      int ans = Integer.MAX_VALUE;

      for(int i=0;i<s2.length();i++){
        char c = s2.charAt(i);
        if(c != (i%2 == 0 ? '0' : '1')) diff1++;
        if(c != (i%2 == 0 ? '1' : '0')) diff2++;
      
        if(i >= n){
            char prev = s2.charAt(i-n);

            if(prev != ((i-n)%2 == 0 ? '0' : '1')) diff1--;
        if(prev != ((i-n)%2 == 0 ? '1' : '0')) diff2--;
        }
        if(i >= n-1){
            ans = Math.min(ans,Math.min(diff1,diff2));
        }
      }
        return ans;
    }
}