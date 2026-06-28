class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);

        }
        
        return Math.max(0,max-min-2*k);
        
    }
}