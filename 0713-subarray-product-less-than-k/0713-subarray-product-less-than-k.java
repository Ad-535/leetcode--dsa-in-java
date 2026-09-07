class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int st = 0;
        int end = 0;
        int p = 1;
        int ans = 0;
        while(end<nums.length){
            p*=nums[end];
            while(p>=k && st<=end){
                p/=nums[st];
                st++;
            }
            ans+=end-st+1;
            end++;
        }
        return ans;
    }
}