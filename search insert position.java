class Solution {
    public int searchInsert(int[] n, int t) {
        int low=0;
        int high=n.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(t==n[mid]) return mid;
            else if(t>n[mid]) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
}