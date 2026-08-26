class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        int n = s.length();

        for(int i=0;i<n;i++){
            int cnt = 0;
            StringBuilder curr = new StringBuilder();

            for(int j=i;j<n;j++){
                curr.append(s.charAt(j));

                if(s.charAt(j) == '1') cnt++;

                if(cnt > k){
                    break;
                }
                if(cnt == k) {
                String currStr = curr.toString();

                if(ans.isEmpty() || currStr.length() < ans.length() || (currStr.length() == ans.length() && currStr.compareTo(ans) < 0)){
                    ans = currStr;
                }
            }
        }
        }

        return ans;
    }
}