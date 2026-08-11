class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i == nums.length - 1 || nums[i + 1] != nums[i] + 1) {
                break;
            }
        }
        while (set.contains(sum)) {
            sum++;
        }
        return sum;
    }
}