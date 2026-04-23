class Solution {
    public List<String> twoEditWords(String[] q, String[] d) {
        ArrayList<String> ans = new ArrayList<>();
        int n = q.length;
        for(int i = 0; i < n; i++){
            String s1 = q[i];
          for(int j=0;j<d.length;j++){
            String s2 = d[j];
            int count = 0;     
          
    for(int k = 0; k < s1.length(); k++){
        if(s1.charAt(k) != s2.charAt(k)){
            count++;
        }
    }
    if(count <= 2){
        ans.add(s1);
        break;
    }
   
     }
        }
      return ans;
    }
}