class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ans = new ArrayList<>();
        int minr = 0;
        int minc = 0;
        int maxr = arr.length-1;
        int maxc = arr[0].length-1;
        int c = 0;
        int t = arr.length*arr[0].length;
        while(c<t){
        for(int i=minc;i<=maxc && c<t;i++){
            ans.add(arr[minr][i]);
            c++;
        }
        minr++;
        for(int i=minr;i<=maxr && c<t;i++){
            ans.add(arr[i][maxc]);
            c++;
        }
        maxc--;
        for(int i=maxc;i>=minc && c<t;i--){
            ans.add(arr[maxr][i]);
            c++;
        }
        maxr--;
        for(int i=maxr;i>=minr && c<t;i--){
            ans.add(arr[i][minc]);
            c++;
        }
        minc++;
        }
        return ans;
    }
}