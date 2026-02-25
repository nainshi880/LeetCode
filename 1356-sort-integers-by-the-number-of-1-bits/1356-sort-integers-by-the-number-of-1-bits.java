class Solution {
    public int[] sortByBits(int[] arr) {
        Integer []num = new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
        num[i] = arr[i];
        }
        Arrays.sort(num,(a,b) -> {
            int bitsA = Integer.bitCount(a);
            int bitsB = Integer.bitCount(b);

            if(bitsA == bitsB){
                return a-b;
            }
            return bitsA - bitsB;
        });
        for(int i=0;i<arr.length;i++){
            arr[i] = num[i];
        }
          return arr;
    }
}