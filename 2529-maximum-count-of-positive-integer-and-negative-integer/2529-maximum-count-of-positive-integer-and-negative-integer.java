class Solution {
    public int maximumCount(int[] nums) {
        int pos = 0;
        int nos = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos++;
            }
            else if(nums[i]<0){
                nos++;
            }
            max = Math.max(max,Math.max(pos,nos));
        }
        return max;
    }
}