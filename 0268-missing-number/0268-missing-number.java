class Solution {
    public int missingNumber(int[] nums) {
         Set<Integer> set = new HashSet<>();
        for(int ele : nums)
        set.add(ele);
        for(int i =0;i<nums.length+2;i++){
            if(!set.contains(i))
            return i;
        }
        return set.size();
    }
}