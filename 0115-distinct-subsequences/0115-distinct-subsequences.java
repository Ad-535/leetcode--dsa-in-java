class Solution {
    public int numDistinct(String s, String t) {
        int dp[][]=new int[s.length()+1][t.length()+1];
        for(int i=0;i<dp.length;i++)dp[i][0]=1;
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                dp[i][j]+=dp[i-1][j];
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public int fun(String a,String b,int i,int j){
        if(j==b.length())return 1;
        if(i==a.length())return 0;
        int inc=0,exc=0;
        if(a.charAt(i)==b.charAt(j)){
            inc=fun(a,b,i+1,j+1);
        }
        exc=fun(a,b,i+1,j);
        return inc+exc;
    }
}