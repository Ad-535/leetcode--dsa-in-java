class Solution {
    public boolean isPerfectSquare(int num) {
        int root = 0;
        for(long i=1;i<=(long)num;i++){
            if(i*i==num)
            return true;
        }
        return false;
    }
}