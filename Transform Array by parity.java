class Solution {
    public int[] transformArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int index = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                ans[index++] = 0;
            }
        }

        while (index < n) {
            ans[index++] = 1;
        }

        return ans;   
    }
}