class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
        int sum[]=new int[n];
        sum[n-1]=stoneValue[n-1];
        for(int i=n-2;i>=0;i--)sum[i]=stoneValue[i]+sum[i+1];
        Integer dp[]=new Integer[n];
        int alice=fun(sum,0,dp);
        if(alice>sum[0]/2.0)return "Alice";
        else if(alice<sum[0]/2.0)return "Bob";
        return "Tie";
    }
    int fun(int sum[],int in,Integer dp[]){
        if(in>=sum.length)return 0;
        if(dp[in]!=null)return dp[in];
        int max=Integer.MIN_VALUE;
        for(int x=1;x<=3;x++){
            max=Math.max(max,sum[in]-fun(sum,in+x,dp));
        }
        return dp[in]=max;
    }
}