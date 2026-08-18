class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int duplicate = -1;
        int missing = -1;
        for(int i:nums){
            if(set.contains(i)){
            duplicate = i;
            }
            else{
                set.add(i);
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
            missing = i;
            break;
        }
    }
         return new int[]{duplicate,missing};
    }
}