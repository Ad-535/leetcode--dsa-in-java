class Solution {
    public int minimumPushes(String word) {
        int f[]=new int[26];
        for(char ch:word.toCharArray()){
            f[ch-'a']++;
        }
        List<Integer> l=new ArrayList<>();
        for(int i:f)if(i!=0)l.add(i);
        Collections.sort(l,Collections.reverseOrder());
        int ans=0;
        for(int i=0;i<l.size();i++){
            int p=i/8+1;
            ans+=l.get(i)*p;
        }
        return ans;
    }
}