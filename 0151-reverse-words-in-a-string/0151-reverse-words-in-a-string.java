class Solution {
    public String reverseWords(String s) {
        String p = "";
        String str[] = s.trim().split("\\s+");
        for(int i=str.length-1;i>=0;i--) {
            p+=str[i]+" ";
        }
        p = p.trim();
        return p;
    }
}