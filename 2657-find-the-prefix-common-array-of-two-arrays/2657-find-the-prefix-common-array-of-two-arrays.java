class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] p = new int[n];
     for(int k=0;k<n;++k){
         int count = 0;
        for(int i=0;i<=k;++i){
            for(int j=0;j<=k;++j){
                if(A[i] == B[j]){
                    ++count;
                    break;
                }
            }
        }
        p[k] = count;
     }
     return p;
    }
}