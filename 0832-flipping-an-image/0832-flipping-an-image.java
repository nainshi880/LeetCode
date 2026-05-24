class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int n = image[0].length;

        for(int []i : image){
            for(int j=0;j<(n+1)/2;j++){
                int temp = i[j]^1;
                i[j] = i[n-j-1]^1;
                i[n-j-1] = temp; 
            }
        }
        return image;
    }
}