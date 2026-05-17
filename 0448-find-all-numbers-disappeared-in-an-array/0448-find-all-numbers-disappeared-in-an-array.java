class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int n = arr.length;
        int i= 0;
        while(i < n){
           int c = arr[i]-1;
           if(arr[i] != arr[c]){
            swap(arr,i,c);
           }else{
            i++;
           }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j=0;j<n;j++){
            if(arr[j] != j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
       void swap(int []arr,int f,int s){
        int temp = arr[f];
        arr[f] = arr[s];
         arr[s] = temp;
       }
    
}