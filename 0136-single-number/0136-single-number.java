class Solution {
    public int singleNumber(int[] nums) {
        int sum = 0;
        for(int arr:nums){
            sum^=arr;
        }
        return sum;
    }
}