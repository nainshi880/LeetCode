class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] sort = arr.clone();

        Arrays.sort(sort);

        int i=0;
        for(int x: sort){
            if(i == 0 || sort[i-1] != x){
                sort[i++] = x;
            }
        }
        
        int[] unique = Arrays.copyOf(sort,i);

        for(int j=0;j<arr.length;j++){
            arr[j] = Arrays.binarySearch(unique,arr[j])+1;
        }
        return arr;

    }
}