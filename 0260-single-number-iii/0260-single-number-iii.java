class Solution {
    public int[] singleNumber(int[] nums) {
        int arr[] = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
        if(set.contains(i)){
            set.remove(i);
        }
        else{
            set.add(i);
         }
        }
        int j = 0;
        for(int i:set){
            arr[j] = i;
            j++;
        }
        return arr;
    }
}