class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int lo = 0;
        int hi = n-1;
        int firstnn = n;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid]>=0){
                firstnn = mid;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        } lo = 0;
          hi = n-1;
         int firstp = n;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid]>0){
              firstp = mid;
              hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
            int nc = firstnn;
            int pc = n-firstp;
         return Math.max(nc,pc);
    }
}