class Solution {
    public long minimumCost(int[] nums, int k, int dist) {
        int n = nums.length;
        long ans = Long.MAX_VALUE;
         TreeMap<Integer, Integer> small = new TreeMap<>();
        TreeMap<Integer, Integer> large = new TreeMap<>();

         long smallSum = 0;
         long smallSize = 0;
         int L = 1;
           for (int R = 1; R < n; R++) {
            add(small, nums[R]);
            smallSum += nums[R];
            smallSize++;

            if (smallSize > k - 1) {
                int x = small.lastKey();
                remove(small, x);
                smallSum -= x;
                smallSize--;
                add(large, x);
            }

            if (R - L + 1 > dist + 1) {
                if (small.containsKey(nums[L])) {
                    remove(small, nums[L]);
                    smallSum -= nums[L];
                    smallSize--;

                    if (!large.isEmpty()) {
                        int y = large.firstKey();
                        remove(large, y);
                        add(small, y);
                        smallSum += y;
                        smallSize++;
                    }
                } else {
                    remove(large, nums[L]);
                }
                L++;
            }

            if (smallSize == k - 1) {
                ans = Math.min(ans, nums[0] + smallSum);
            }
        }

        return ans;
    }

    private void add(TreeMap<Integer, Integer> map, int x) {
        map.put(x, map.getOrDefault(x, 0) + 1);
    }

    private void remove(TreeMap<Integer, Integer> map, int x) {
        if (map.get(x) == 1) map.remove(x);
        else map.put(x, map.get(x) - 1);
    
    }
}