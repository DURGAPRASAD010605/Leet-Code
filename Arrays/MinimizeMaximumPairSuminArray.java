class Solution {
    public int minPairSum(int[] nums) {
        int max = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n / 2; i++) {
            int sum = nums[i] + nums[n - 1 - i];
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
