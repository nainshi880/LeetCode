class Solution {
    public boolean canBeValid(String s, String l) {
             if(s.length()%2 == 1){
                return false;
             }
        int balance = 0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i) == '(' || l.charAt(i) == '0'){
            balance++;
        }else{
            balance--;
        }
        if(balance < 0){
            return false;
        }
       }
       balance = 0;
       for(int i = s.length() - 1; i >= 0; i--){
        if(s.charAt(i) == ')' || l.charAt(i) == '0'){
            balance++;
        
        }else{
            balance--;
        }
        if(balance < 0){
            return false;
        }
       }
       return true;
    }
}