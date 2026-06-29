class Solution {
    public int finalValueAfterOperations(String[] op) {
        int x=0;
        for (String sansh:op ){
            if (sansh.contains("++")){
                x++;
            }else {
                x--;
            }
        }
        return x;
    }
}