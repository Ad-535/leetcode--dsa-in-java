class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(nums.length==1)
        return nums[0];
        if(nums[0]!=nums[1])return nums[0];
        if(nums[n-1]!=nums[n-2])return nums[n-1];
        int lo = 0;
        int hi = nums.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid]!=nums[mid-1]  && nums[mid]!=nums[mid+1])return nums[mid];
            int f = mid;
            int s = mid;
            if(nums[mid-1]==nums[mid]){
                f = mid-1;
            }
            else{
                s = mid+1;
            } 
             int leftc = f - lo;
             int right = hi - s;
             if(leftc%2==0)lo = s+1;
             else hi = f - 1;
        }
        return 9;
    }
}