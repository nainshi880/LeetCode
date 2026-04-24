class Solution {
    public int furthestDistanceFromOrigin(String m) {
        int n = m.length();
        int dist = 0;
         int l = 0, r = 0, d=0;
        for(int i=0;i<n;i++){
            if(m.charAt(i) == 'L'){
                l++;
            }else if(m.charAt(i) == 'R'){
                r++;
            }else{
                d++;
            }
        }
        if(l > r){
            dist = l- r+d;
        }else if(r > l){
            dist = r-l+d;
        }else{
            dist = d;
        }
        return dist;
    }
}