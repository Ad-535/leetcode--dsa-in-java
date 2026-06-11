class Solution {
    public int longestPalindromeSubseq(String s) {
        String t = "";
        for(int i = s.length()-1; i >= 0; i--){
            t += s.charAt(i);
        }

        Integer dp[][] = new Integer[s.length()][t.length()];
        
        return lcs(s, t, 0, 0, dp); 
    }

    int lcs(String s1, String s2, int i, int j, Integer dp[][]){
        if(i == s1.length() || j == s2.length())
            return 0;

        if(dp[i][j] != null) return dp[i][j];

        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] = 1 + lcs(s1, s2, i+1, j+1, dp);
        } else {
            int a = lcs(s1, s2, i+1, j, dp);
            int b = lcs(s1, s2, i, j+1, dp);
            return dp[i][j] = Math.max(a, b);
        }
    }
}