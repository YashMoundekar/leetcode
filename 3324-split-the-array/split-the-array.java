class Solution {
    public boolean isPossibleToSplit(int[] nums) {

        int fre[]=new int[101];

        for( int i:nums){
            fre[i]++;
        }
        for(int i=0;i<fre.length;i++){
            if(fre[i]>2){
                return false;
            }
        }

        return true;
    }
}