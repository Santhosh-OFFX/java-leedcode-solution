class Solution {
    public int numOfSubarrays(int[] A, int k, int t) {
       int cnt=0;
       int sum=0;
       for(int i=0;i<k;i++){
        sum=sum+A[i];
       } 
       int avg=sum/k;
       if(avg>=t) cnt++;
       int st=1,end=k;
       while(end<A.length){
        sum=sum-A[st-1]+A[end];
        avg=sum/k;
        if(avg>=t) cnt++;
        st++;
        end++; 
       }
       return cnt;
    }
}