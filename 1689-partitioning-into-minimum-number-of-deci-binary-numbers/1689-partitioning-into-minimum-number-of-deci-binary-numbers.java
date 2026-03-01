class Solution {
    public int minPartitions(String n) {
        int l = n.length();
        int max = 0;
        for(int i=0;i<l;i++){
            max = Math.max(max,n.charAt(i)-'0');
        }
        return max;
    }
}