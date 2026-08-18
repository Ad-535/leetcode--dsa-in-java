class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int missing = 0;
        int duplicate = 0;
        int n = nums.length;
        for(int i:nums){
            if(set.contains(i))
            duplicate = i;
            else{
                set.add(i);
            }
        }
        int sum = 0;
        for(int i:set)
        sum+=i;
        int total = n*(n+1)/2;
        missing = total-sum;
        return new int[]{duplicate,missing};
    }
}