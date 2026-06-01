class Solution {
    public int bitwiseComplement(int n) {
        int comp = 0;
        String b = Integer.toBinaryString(n);
        System.out.println(b);
        StringBuilder sb = new StringBuilder(); 
        for(int i=0;i<b.length();i++){
             if(b.charAt(i) == '0'){
                sb.append('1');
             }else if(b.charAt(i) == '1') sb.append('0');
        }
        return Integer.parseInt(sb.toString(),2);
    }
}