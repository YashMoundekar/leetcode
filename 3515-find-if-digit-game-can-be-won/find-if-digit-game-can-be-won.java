class Solution {
    public boolean canAliceWin(int[] nums) {

        int dou=0;
        int single=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && nums[i]<10){
                single+=nums[i];
            }else{
                dou+=nums[i];
            }
        }


        int alice=Math.max(single,dou);
        int bob=Math.min(single,dou);
        return alice>bob;
    }
}