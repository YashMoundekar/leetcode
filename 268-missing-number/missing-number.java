class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(nums[0]!=0)
            return 0;
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]>1){
                return nums[i-1]+1;
            }
        }
        return n;
    }
}