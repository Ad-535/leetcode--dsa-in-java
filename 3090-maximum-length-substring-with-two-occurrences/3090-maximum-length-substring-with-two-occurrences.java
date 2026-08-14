class Solution {
    public int maximumLengthSubstring(String s) {
        int l=0,r=0;
        int ans=0;
        int f[]=new int [26];
        while(r<s.length()){
            char ch=s.charAt(r);
            f[ch-'a']++;
            while(l<=r && f[ch-'a']>2){
                char ch2=s.charAt(l);
                f[ch2-'a']--;
                l++;
            }
            r++;
            ans=Math.max(ans,r-l);
        }
        return ans;
    }
}