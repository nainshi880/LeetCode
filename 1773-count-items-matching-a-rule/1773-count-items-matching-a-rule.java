class Solution {
    public int countMatches(List<List<String>> items, String rK, String rV) {
        int ind = 0;
        if(rK.equals("type")){
            ind = 0;
        }
        else if(rK.equals("color")) {
            ind = 1;
        }
        else ind = 2;

        int count = 0;
        for(List<String> item : items){
            if(item.get(ind).equals(rV)){
                count++;
            }
        }
        return count;
    }
}