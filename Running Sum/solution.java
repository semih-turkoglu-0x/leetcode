class Solution {
    public int[] runningSum(int[] nums) {
        int[] toReturn = new int[nums.length];
        toReturn[0] = nums[0];
        for (int i = 1; i < nums.length; i ++){
            toReturn[i] = nums[i] + toReturn[i -1];
        }
        return toReturn;
    }
}
