class Solution {
    public int minJumps(int[] nums) {
         int n = nums.length;

        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < n; i++){

            for(int p : getPrimeFactors(nums[i])){

                map.putIfAbsent(p, new ArrayList<>());
                map.get(p).add(i);
            }
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];

        q.offer(0);
        vis[0] = true;

        int steps = 0;

        while(!q.isEmpty()){

            int size = q.size();

            while(size-- > 0){

                int i = q.poll();

                if(i == n - 1) return steps;
                if(i - 1 >= 0 && !vis[i - 1]){
                    vis[i - 1] = true;
                    q.offer(i - 1);
                }

                if(i + 1 < n && !vis[i + 1]){
                    vis[i + 1] = true;
                    q.offer(i + 1);
                }

                if(isPrime(nums[i])){

                    int p = nums[i];

                    if(map.containsKey(p)){

                        for(int nei : map.get(p)){

                            if(!vis[nei]){
                                vis[nei] = true;
                                q.offer(nei);
                            }
                        }

                        map.remove(p);
                    }
                }
            }

            steps++;
        }

        return -1;
    }

    private boolean isPrime(int x){

        if(x < 2) return false;

        for(int i = 2; i * i <= x; i++){

            if(x % i == 0) return false;
        }

        return true;
    }

    private List<Integer> getPrimeFactors(int x){

        List<Integer> factors = new ArrayList<>();

        for(int i = 2; i * i <= x; i++){

            if(x % i == 0){

                factors.add(i);

                while(x % i == 0){
                    x /= i;
                }
            }
        }

        if(x > 1) factors.add(x);

        return factors;
    }
}