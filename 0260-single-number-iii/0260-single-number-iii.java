class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[] = new int[2];
        int j = 0;
        for(int i:nums){
            int c = map.getOrDefault(i,0);
            map.put(i,c+1);
        }
        for(int k:map.keySet()){
            int f = map.get(k);
            if(f==1){
                arr[j]=k;
                j++; 
             }  
        }
       return arr;
    }
}