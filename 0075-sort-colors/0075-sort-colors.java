class Solution {

    public static void swap(int start,int end,int[]nums){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
    public void sortColors(int[] nums) {

        int n=nums.length;

        int mid=0;

        int low=0;

        int high=n-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(mid,low,nums);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(mid,high,nums);
                high--;
            }
        }
       
        
    }
}