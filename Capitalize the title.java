class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        String ans = "";

        for (int i = 0; i < words.length; i++) {

            words[i] = words[i].toLowerCase();

            if (words[i].length() > 2) {
                words[i] = Character.toUpperCase(words[i].charAt(0))
                        + words[i].substring(1);
            }

            ans += words[i];

            if (i != words.length - 1) {
                ans += " ";
            }
        }

        return ans;
    }
}
