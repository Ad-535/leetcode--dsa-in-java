class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums[nums.length-1];
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i=nums[0];i<=n;i++){
            if(!set.contains(i))
            ans.add(i);
        }
        return ans;
    }
}