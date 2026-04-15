class Solution {
    public int closestTarget(String[] w, String t, int st) {
        int n = w.length;
        int diff = Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
        if(w[i].equals(t)){
            int c = Math.abs(st-i);
            int ac= n-c;
            diff = Math.min(diff,Math.min(c,ac));
        }
       }
       
        return diff == Integer.MAX_VALUE ? -1 : diff;
    }
}