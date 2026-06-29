class Solution {
    public int getLucky(String s, int k) {
       String num ="";
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        num = num +(ch - 'a' + 1);
       } 
       for (int j =0; j< k;j++){
        int sum =0;
        for(int i=0;i<num.length(); i++){
            sum =sum + (num.charAt(i) -'0');
        }
        num = String.valueOf(sum);
       }
       return Integer.parseInt(num);
    }
}