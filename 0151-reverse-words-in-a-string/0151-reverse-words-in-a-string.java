class Solution {
    public String reverseWords(String s) {
        String newStr = "";
        String str[] = s.trim().split("\\s+");
        for(int i=str.length-1;i>0;i--) {
            newStr+=str[i]+" ";
        }
        return newStr+str[0];
    }
}