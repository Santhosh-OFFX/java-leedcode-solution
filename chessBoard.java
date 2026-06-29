class Solution {
    public boolean squareIsWhite(String c) {
        char ch[]=c.toCharArray();
        int num=0;
       for( char b:ch){
        num=num+b;
       }
       if(num%2==0) return false;
       
       else return true;
    }
}