class Solution {
    public int maxSubArray(int[] nums) {
        int maximum=nums[0];
        int curr=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=Math.max(nums[i],nums[i]+curr);
            maximum=Math.max(curr,maximum);
        }
        return maximum;

    }
}