class Solution {
    public int maxVowels(String s, int k) {
        int vcc=0,max=0;
        for(int i=0;i<k;i++){
            if (isVowel(s.charAt(i))) vcc++;
        }
        max=vcc;
        int st=1,end=k;
        while(end<s.length()){
            if(isVowel(s.charAt(st-1))) vcc--;
              if(isVowel(s.charAt(end))) vcc++;
              max=Math.max(max,vcc);
              st++;
              end++;
        }
        return max;
    }
     boolean isVowel(char ch){
    return(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }
}
