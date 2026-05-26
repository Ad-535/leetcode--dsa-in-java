class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele: nums1)
        list.add(ele);
        for(int ele: nums2)
        list.add(ele);
        Collections.sort(list);
        int n = list.size();
        if(n%2==1){
            return list.get(n/2);
        }
        else{
            int a = list.get(n/2);
            int b = list.get(n/2-1);
            return (a+b)/2.0;
        }
        
    }
}