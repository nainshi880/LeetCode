class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int countO = 0;
        int ind = 0;
        int insert = 0;
        while(ind < n){
            char c = s.charAt(ind);
            if(c == '('){
                countO ++;
                ind++;
            }else{
                if(countO > 0){
                    countO--;
                }else{
                    insert++;
                }
                if(ind < n-1 && s.charAt(ind+1) == ')'){
                    ind += 2;
                }else{
                    insert++;
                    ind++;
                }
            }

        }

       insert += 2*countO;

       return insert;
    }
}