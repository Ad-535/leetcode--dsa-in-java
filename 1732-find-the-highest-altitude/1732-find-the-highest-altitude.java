class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int max = 0;
        int altitude[] = new int[n+1];
        for(int i=1;i<altitude.length;i++){
            altitude[i] = altitude[i-1]+gain[i-1];
            max = Math.max(altitude[i],max);
        }
        return max;
    }
}