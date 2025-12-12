class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int winSize = n - k;
        if(winSize == 0){
            return Arrays.stream(cardPoints).sum();
        }
        int total = 0;
        for(int x : cardPoints){
            total += x;
        }
        int curr = 0;
        int minSize = Integer.MAX_VALUE;
        int left =0;
        for(int right =0;right < n;right++){
            curr += cardPoints[right];
            if(right - left +1 > winSize){
                curr -= cardPoints[left];
                left++;
            }
            if(right - left +1 == winSize){
                minSize = Math.min(curr,minSize);
            }
        }
        return total - minSize;
    }
}