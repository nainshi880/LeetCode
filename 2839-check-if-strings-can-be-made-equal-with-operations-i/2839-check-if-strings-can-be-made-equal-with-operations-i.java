class Solution {
    public boolean canBeEqual(String s1, String s2) {
        
        for(int i=0;i<4;i++){
            for(int j=i+2;j<4;j += 2){
                if(s1.charAt(i) != s2.charAt(i)){
                StringBuilder sb = new StringBuilder(s1);
                char temp = sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j)); 
                sb.setCharAt(j,temp);
                s1 = sb.toString();   
                } 
                if(s1.equals(s2)) return true;
            }
        }
         return false;
    }
}