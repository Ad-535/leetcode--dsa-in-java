class Solution {
    public boolean predictTheWinner(int[] nums) {
        int player1=fun(nums,0,nums.length-1);
        int total=0;
        for(int i:nums)total+=i;
        int player2=total-player1;
        return player1>=player2;
    }
    int fun(int nums[],int i,int j){
        if(i>j)return 0;

        int first=nums[i]+Math.min(fun(nums,i+2,j),fun(nums,i+1,j-1));
        int last=nums[j]+ Math.min(fun(nums,i+1,j-1),fun(nums,i,j-2));
        return Math.max(first,last);
    }
}