class Solution {
    public int dominantIndex(int[] nums) {
       int max = -1;
       int smax = -1;
       int index = -1;
       for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            max = nums[i];
            smax = max;
            index = i;
        }
        else if(smax>nums[i]){
            smax = nums[i];
        }
       }
        if(max>=2*smax){
         return index;
        }
        return -1;
    }
}