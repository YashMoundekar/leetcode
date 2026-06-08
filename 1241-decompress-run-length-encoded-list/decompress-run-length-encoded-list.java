class Solution {
    public int[] decompressRLElist(int[] nums) {
        int k=0;
        int size=0;
        for(int m=0;m<nums.length;m+=2)
        size+=nums[m];

        int res[]=new int[size];
        for(int i=0;i<nums.length;i+=2){
           int fre= nums[i];
           int num=nums[i+1];
           for(int j=0;j<fre;j++){
            res[k++]=num;
           }
        }
        return res;
    }
}