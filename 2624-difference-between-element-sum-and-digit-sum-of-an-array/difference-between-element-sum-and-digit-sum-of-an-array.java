class Solution {
    public int differenceOfSum(int[] nums) {

        int num=0;
        int digit=0;

        for(int i=0;i<nums.length;i++){
            num+=nums[i];
                int temp=nums[i];
                while(temp!=0){
                    int rem=temp%10;
                    digit+=rem;
                    temp/=10;
                }
            
        }
        return num-digit;
    }
}