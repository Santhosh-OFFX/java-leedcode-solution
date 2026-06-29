class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum=0;
        int digitSum=0;
        for(int num : nums){
            elementSum = elementSum + num;
            int temp=num;
            while (temp>0){
                digitSum = digitSum +temp%10;
                temp = temp/10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }
}