class Solution {
    public boolean arrayStringsAreEqual(String[] w1, String[] w2) {
        int m = w1.length;
        int n = w2.length;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<m;i++){
            sb1.append(w1[i]);
        }
        System.out.println(sb1);
        for(int i=0;i<n;i++){
            sb2.append(w2[i]);
        }
        System.out.println(sb2);
        if((sb2.toString()).equals(sb1.toString())) return true;

        return false;
    }

}