class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        Stack <Integer> stack = new Stack<Integer>();

        for(int i=n-1;i>=0;i--){
            stack.push(nums[i]);
        }

        for(int i=n-1;i>=0;i--){
           
            while(!stack.isEmpty() && nums[i] >= stack.peek()){
                stack.pop();
            }
            if(stack.size() == 0) result[i] = -1;
            else result[i] = stack.peek();
            stack.push(nums[i]);

        } 
        return result;
    }
}