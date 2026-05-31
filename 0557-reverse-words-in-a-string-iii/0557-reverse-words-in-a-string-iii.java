class Solution {
    public String reverseWords(String s) {
        int n = s.length();
         String[] w = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String wo : w){
            StringBuilder r = new StringBuilder(wo).reverse();
            sb.append(r).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();

    }
}