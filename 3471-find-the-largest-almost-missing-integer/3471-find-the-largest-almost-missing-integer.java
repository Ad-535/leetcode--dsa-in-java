class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        int max=-1;
        int f[]=new int[51];
        for(int i=0;i<n;i++){
            f[nums[i]]++;
            max=Math.max(max,nums[i]);
        }
        if(k==n)return max;
        if(k==1){
            max=-1;
            for(int i=0;i<51;i++){
                if(f[i]==1)max=Math.max(max,i);   
            }
            return max;
        }
        max=-1;
        if(f[nums[0]]==1)max=nums[0];
        if(f[nums[n-1]]==1)max=Math.max(max,nums[n-1]);
        return max;
    }
}