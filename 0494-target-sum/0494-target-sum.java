class Solution {
    static int absSum;
    public int findTargetSumWays(int[] arr, int target) {
         absSum = 0;
        for(int ele : arr){
            absSum += Math.abs(ele);
        }
        int[][] dp = new int[arr.length][2*absSum+1];
        return helper(0,0,arr,target,dp);
    }
    public static int helper(int i,int sum,int[] arr,int target,int[][] dp){
        if(i == arr.length){
            if(target == 0){
             return 1;
        }else{
            return 0;
        }
        }
        if(dp[i][absSum+sum] != 0) return  dp[i][absSum+sum];
        
        int add = helper(i+1,sum+arr[i],arr,target-arr[i],dp);
        int sub = helper(i+1,sum-arr[i],arr,target+arr[i],dp);
        return dp[i][sum+absSum] = add+sub;
    }
}

