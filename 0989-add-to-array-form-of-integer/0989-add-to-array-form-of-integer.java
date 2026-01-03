class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int l = num.length-1;
      int carry = 0;
      while(l >= 0 || k >0){
         int numValue = 0;
         if(l >= 0){
            numValue = num[l];
         }
         int d = k%10;
         int sum = numValue +d+carry;
         int digit = sum%10;
         carry = sum/10;

         result.add(digit);
         l--;
         k = k/10;
      }
      if(carry >0){
        result.add(carry);
      }
      Collections.reverse(result);
      return result;
    }
}