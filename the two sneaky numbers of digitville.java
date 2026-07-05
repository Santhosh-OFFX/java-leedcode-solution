class Solution {
    public int[] getSneakyNumbers(int[] nums) {
       int[] freq = new int[nums.length];
        int[] ans = new int[2];
        int j = 0;

        for (int num : nums) {
            freq[num]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 2) {
                ans[j++] = i;
            }
        }

        return ans;  
    }
}