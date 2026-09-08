class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="";
        for(int i=0;i<word1.length;i++){
            s1+=word1[i];
        }
        String s2="";
        for(String s:word2)s2+=s;

        return s1.equals(s2);
    }
}