class Solution {
     public int maxArea(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        nse[n-1] = n;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
           while(st.size() >0 && arr[st.peek()] >= arr[i]) st.pop();
           if(st.size() == 0) nse[i] = n;
           else nse[i] = st.peek();
           st.push(i);
        }
        int[] pse = new int[n];
         Stack<Integer> st2 = new Stack<>();
         pse[0] = -1;
        st2.push(0);
        for(int i=1;i<n;i++){
           while(st2.size() >0 && arr[st2.peek()] >= arr[i]) st2.pop();
           if(st2.size() == 0) pse[i] = -1;
           else pse[i] = st2.peek();
           st2.push(i);
        }
        int maxArea = 0;
        for(int i=0;i<n;i++){
            maxArea = Math.max(maxArea,arr[i]*(nse[i]-pse[i]-1));
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
         int[] h = new int[n];
             int max = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              if (mat[i][j] == '1'){
               h[j] += 1;
              } else h[j] = 0;
            } 
                max = Math.max(maxArea(h),max);
              
        }
        return max;
    }
}