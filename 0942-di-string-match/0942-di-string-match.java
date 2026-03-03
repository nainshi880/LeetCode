class Solution {
    public int[] diStringMatch(String s) {
        int []arr = new int[s.length()+1];
          int idx = 0;
          int left = 0;
          int right = s.length();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == 'I'){
                arr[idx] = left;
                idx++;
                left++;
            }else{
                arr[idx] = right;
                idx++;
                right--;
            }
        }
            
            if(s.charAt(s.length()-1) == 'I'){
                arr[idx] = left;
            }else{
                arr[idx] = right;
            }
        
        return arr;
    }
}