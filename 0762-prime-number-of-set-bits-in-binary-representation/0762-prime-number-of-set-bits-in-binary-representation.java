class Solution {
    public int countPrimeSetBits(int left, int right) {
        Set<Integer> primes = Set.of(2,3,5,7,11,13,17,19,23,29,31);
        int total = 0;
        for(int i=left;i<= right;i++){
            int setBits = Integer.bitCount(i);
            if(primes.contains(setBits)){
                total++;
            }
        }
        return total;

    }
}