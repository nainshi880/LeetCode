class Solution {
    public int closestTarget(String[] w, String t, int st) {
         int n = w.length;

        for(int d = 0; d < n; d++){
            if(w[(st + d) % n].equals(t)) return d;
            if(w[(st - d + n) % n].equals(t)) return d;
        }

        return -1;
    }
}