class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        int prod = 1;
        for(int s=0,e=0;e<n;e++){
            prod *= nums[e];
            while(prod>=k && s<e){
                prod = prod/nums[s];
                s++;
            }
            if(prod<k){
                int win = (e-s)+1;
                count+=win;
            }
        }
        return count;
    }
}