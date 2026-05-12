class Solution {
    public int minimumEffort(int[][] tasks) {
       Arrays.sort(tasks, (a, b) ->
            (b[1] - b[0]) - (a[1] - a[0])
        );

        int e = 0;
        int ans = 0;

        for(int[] t : tasks){

            int a = t[0];
            int min = t[1];

            if(e < min){

                ans += (min - e);
                e = min;
            }

            e -= a;
        }

        return ans; 
    }
}