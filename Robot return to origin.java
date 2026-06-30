class Solution {
    public boolean judgeCircle(String moves) {
        int row=0,col=0;
        char[] ch=moves.toCharArray();
        for(char s:ch){
            if(s=='U') row--;
            else if(s=='D') row++;
            else if(s=='R') col++;
            else if(s=='L') col--;
        }
        if(row==0 && col==0) return true;
        return false;
    }
}