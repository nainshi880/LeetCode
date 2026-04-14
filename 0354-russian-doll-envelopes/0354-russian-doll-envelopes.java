class Solution {
    public int maxEnvelopes(int[][] env) {
        Arrays.sort(env,(a,b) -> (a[0] != b[0]) ? Integer.compare(a[0],b[0]) : Integer.compare(b[1],a[1]));
        ArrayList<Integer> ans = new ArrayList<>();
        for(int[] a: env){
            int ele = a[1];
            if(ans.size() == 0 || ele > ans.get(ans.size()-1)) ans.add(ele);
            else replace(ele,ans);
        }
        return ans.size();
    }
    public static void replace(int ele,ArrayList<Integer> ans){
        int n = ans.size();
        int low = 0;
        int high = n-1;
        int lb = -1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(ans.get(mid) >= ele){
                lb = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
            ans.set(lb,ele);
        
    }

    
}