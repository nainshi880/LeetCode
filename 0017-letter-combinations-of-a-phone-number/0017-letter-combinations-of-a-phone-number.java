class Solution {

     private static String[] Keys = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
    public List<String> letterCombinations(String digits) {

         List<String> result = new ArrayList<>();
        if(digits.length() == 0 || digits == null){
          return result;
        }
          backtrack(result, new StringBuilder(), digits, 0);
          return result;
    }

    private void backtrack(List<String> result,StringBuilder curr,String digits,int index){
        if(index == digits.length()){
            result.add(curr.toString());
            return ;
        }
        String letters = Keys[digits.charAt(index) - '0'];
        for(char c: letters.toCharArray()){
            curr.append(c);
             backtrack(result, curr, digits, index + 1);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}