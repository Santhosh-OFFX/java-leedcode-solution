class Solution {
    public int[] replaceElements(int[] A) {
        int max=-1;
        for(int i=A.length-1;i>=0;i--){
            int val=A[i];
            A[i]=max;
            max=Math.max(max,val);
        }
        return A;
    }
}