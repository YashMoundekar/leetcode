class Solution {
    public int lengthOfLIS(int[] nums) {

        int res[]=new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            res[i] = 1;
        }
        for(int i=0;i<nums.length;i++)
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    if(res[j]+1>res[i]){
                        res[i]=Math.max(res[i],res[j]+1);
                    }
                }
            }
            int max=0;
            for(int k=0;k<res.length;k++){
                max=Math.max(max,res[k]);
            }
        
        
        return max;
    }
}