class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();
        for(int h=0;h<12;h++){
            for(int m=0;m<60;m++){

       int totalBits = Integer.bitCount(h) + Integer.bitCount(m);
       if(totalBits == turnedOn){
        ans.add(h +":"+(m<10?"0" + m:m));
       }
           }
        }
        return ans;
    }
}