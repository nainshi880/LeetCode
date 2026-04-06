class Solution {
    public boolean judgeCircle(String m) {
        int n = m.length();
        if(n == 1) return false;
    int d = 0, u = 0, l = 0, r = 0;
       Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char c = m.charAt(i);
            
            if(c == 'U') u++;
            else if(c == 'D') d++;
            else if(c == 'L') l++;
            else if(c == 'R') r++;
        }
        if( u == d && r == l) return true;
           return false;
    }
}