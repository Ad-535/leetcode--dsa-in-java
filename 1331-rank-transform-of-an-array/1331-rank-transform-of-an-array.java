class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer> s=new TreeSet<>();
        for(int i:arr)s.add(i);
        int r=1;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:s){
            m.put(i,r++);
        }
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=m.get(arr[i]);
        }
        return ans;
    }
}