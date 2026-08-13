class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int k : nums) {
            set.add(k);
        }
        int i = 0;
        for (int k : set) {
            nums[i] = k;
            i++;
        }
        return i;
    }
}