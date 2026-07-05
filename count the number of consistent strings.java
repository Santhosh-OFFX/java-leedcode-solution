class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
           int count = 0;

        for (String word : words) {

            boolean ok = true;

            for (int i = 0; i < word.length(); i++) {

                if (allowed.indexOf(word.charAt(i)) == -1) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                count++;
            }
        }

        return count;
    }
}