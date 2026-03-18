class Solution {
    public int removeAlmostEqualCharacters(String word) {
        int n = word.length();
        char [] ch = new char[n];
       
        int count  = 0;
        for(int i=0;i<n-1;){
            char a = word.charAt(i);
            char b = word.charAt(i + 1);

            if (Math.abs(a - b) <= 1) {
                count++;     
                i += 2;      
            } else {
                i++;         
            }    
        }
        return count;
        
    }
}