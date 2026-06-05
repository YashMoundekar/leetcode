class Solution {
    public int findClosest(int x, int y, int z) {
        int num=Math.abs(z-x);
        int num2=Math.abs(y-z);

        if(num>num2){
            return 2;
        }else if(num<num2){
            return 1;
        }else
        return 0;
        
    }
}