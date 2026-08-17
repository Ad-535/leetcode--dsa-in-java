class Solution {
    public int duplicateNumbersXOR(int[] nums) {
         int arr[] = new int[nums.length];
         int j = 0;
         HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            int c = map.getOrDefault(i,0);
            map.put(i,c+1);
        }
        for(int k:map.keySet()){
            int f = map.get(k);
            if(f>1){
                arr[j] = k;
                j++;
            }
        }
         int sum = 0;
         for(int i:arr){
         sum^=i;
         }
        return sum;
    }
}