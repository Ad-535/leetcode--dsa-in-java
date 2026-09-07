class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int st = 0;
        int end = 0;
        int prod = 1;
        int ans = 0;
        while(end<arr.length){
             prod*=arr[end];
            while(prod>=k && st<=end){
                prod/=arr[st];
                st++;
            }
            ans+=end-st+1;
            end++;
        }
      return ans;
    }
}