class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<n;i++){
            List<Integer> tmp = new ArrayList<>();
               int a = nums[i];
                while(a > 0){
                    tmp.add(a%10);
                    a /= 10;
                }
                for(int j=tmp.size()-1;j >= 0;j--){
                    arr.add(tmp.get(j));
                }
        }
        int[] ans = new int[arr.size()];

        for(int i=0;i<arr.size();i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}