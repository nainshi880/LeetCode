class Solution {
    public boolean canReach(int[] arr, int st) {
        return st >= 0 && st < arr.length && arr[st] >= 0 && ((arr[st] = -arr[st]) == 0  ||  canReach(arr,st+arr[st]) || canReach(arr,st-arr[st]));
    }
}