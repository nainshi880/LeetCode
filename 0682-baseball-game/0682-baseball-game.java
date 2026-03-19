class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        int sum = 0;
        for(int i=0;i < op.length;i++){
            if(op[i].equals("C") ){
                 st.pop();
            }else if(op[i].equals("+")){
              int a =  st.peek();
              st.pop();
              int b = st.peek();
              st.push(a);
            st.push(a+b);
            }else if(op[i].equals("D")){
              int c =  st.peek()*2;
              st.push(c);
            }else{
                st.push(Integer.parseInt(op[i]));
            }
        }
        while(st.size() >0){
             sum += st.pop();
        }
        return sum;
    }
}