class Solution {
    public String largestNumber(int[] nums) {
         String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = String.valueOf(nums[i]);
        }
         Arrays.sort(numStrs, (a, b) -> (b + a).compareTo(a + b));
         if(numStrs[0].equals("0")){
            return "0";
         }
         StringBuilder result = new StringBuilder();
        for (String num : numStrs) {
            result.append(num);
        }

        return result.toString();
    }
}