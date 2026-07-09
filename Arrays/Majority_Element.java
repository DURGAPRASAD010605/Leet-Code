class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length/2];
        return max;
    }
}