class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int other = target-nums[i];
            if(ans.containsKey(other)){
                arr[0] = ans.get(other);
                arr[1] = i;
                break;
            }
            else{
                ans.put(nums[i],i);
            }
        }
        return arr;
    }
}