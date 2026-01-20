class Solution {
    public int maxProduct(int[] nums) {
        int pref=1,suf=1;
        int max=-999;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(pref==0) pref=1;
            if(suf==0) suf=1;
            pref*=nums[i];
            suf*=nums[n-i-1];
            max=Math.max(max,Math.max(pref,suf));
        } 
        return max; 
    }
}