class Solution {
    public int countTriplets(int[] arr) {
        int count = 0;
        int n = arr.length;
        for(int start = 0;start <n;start++){
           int xorA = 0;
           for(int mid=start+1;mid < n;mid++){
               xorA ^= arr[mid-1];
               int xorB = 0;
               for(int end = mid;end < n;end++){
                xorB ^= arr[end];
                if(xorA == xorB){
                    count++;
                }
               }
           }
        }
        return count;
    }
}