class Solution {
    public boolean halvesAreAlike(String st) {
        int n = st.length(); 
        int count1 = 0;
        int count2 = 0;
         int mid = n/2;
         String f = st.substring(0,mid);
         String s = st.substring(mid);
          
        for(int i=0;i<f.length();i++){
            char c1 = f.charAt(i);
            if(c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u' || c1 == 'A' || c1 == 'E' || c1 == 'O' || c1 == 'I' || c1 == 'U'){
               count1++;
            }
        }

        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            if(c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u' || c1 == 'A' || c1 == 'E' || c1 == 'O' || c1 == 'I' || c1 == 'U'){
               count2++;
            }
        }
        return count1 == count2;

    }
}