class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int ans = 0, start = 0;
        Map<Integer, Integer> frequency = new HashMap();
        
        for (int end = 0; end < nums.length; end++) {
            frequency.put(nums[end], frequency.getOrDefault(nums[end], 0) + 1);
            while (frequency.get(nums[end]) > k) {
                frequency.put(nums[start], frequency.get(nums[start]) - 1);
                start++;
            }
            ans = Math.max(ans, end - start+1);
        }
        
        return ans;
    }
}