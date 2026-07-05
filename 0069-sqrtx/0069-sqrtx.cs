public class Solution {
    public int MySqrt(int x) {
        long root = 0;
        for(long i=1;i<=(long)x;i++){
            if(i*i>(long)x)break;
            root = i;
            
        }
        return (int)root;
    }
}