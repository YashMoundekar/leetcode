class Solution {
    public int countPartitions(int[] nums) {
        
        int count=0;
        
        for(int i=0;i<nums.length-1;i++){
            int second=0;
            int first=0;
            for (int j = 0; j <= i; j++) {
                first += nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                second+=nums[j];
            }
            if((first-second)%2==0){
                count++;
            }
        }
        return count;
    }
}