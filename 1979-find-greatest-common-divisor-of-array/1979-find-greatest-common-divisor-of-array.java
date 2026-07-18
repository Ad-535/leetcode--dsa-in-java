class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0],max=nums[0];
        for(int i=1,j=nums.length-1;i<=j;i++,j--){
            if(nums[i]<min)min=nums[i];
            else if(nums[i]>max)max=nums[i];
            if(nums[j]<min)min=nums[j];
            else if(nums[j]>max)max=nums[j];
        }
        while(max%min!=0){
            int rem=max%min;
            max=min;
            min=rem;
        }
        return min;
    }
}