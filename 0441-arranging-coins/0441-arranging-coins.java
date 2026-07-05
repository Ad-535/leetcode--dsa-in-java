class Solution {
      public int mySqrt(long x) {
        long lo = 1;
        long hi = x;
        while(lo<=hi){
            long mid = lo+(hi-lo)/2;
            if(mid==x/mid)return (int)mid;
            else if(mid>x/mid)hi = mid-1;
            else lo = mid+1;
        }
        return (int)hi;
    }
    public int arrangeCoins(int n) {
        long m = (long)n;
        return (mySqrt(8*m+1)-1)/2;
    }
}