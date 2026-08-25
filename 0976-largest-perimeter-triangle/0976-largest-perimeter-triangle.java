class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for(int i=1;i<nums.length-1;i++){
         if(nums[i-1]+nums[i]>nums[i+1]){
            int s = nums[i-1]+nums[i]+nums[i+1];
            max = Math.max(s,max);
         }
        }
        return max;
    }
}