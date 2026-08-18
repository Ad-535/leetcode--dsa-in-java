class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int duplicate = -1;
        int missing = -1;
        int sum = 0;
        int n = nums.length;
        for(int i:nums){
            if(set.contains(i)){
            duplicate = i;
            }
            else{
                set.add(i);
            }
        }
        for(int i:set)
        sum+=i;
        int total = n*(n+1)/2;
        missing = total-sum;
         return new int[]{duplicate,missing};
    }
}