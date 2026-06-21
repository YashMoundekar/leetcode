class Solution {
    public int[] getNoZeroIntegers(int n) {
       // int arr[]=new int[2];
        int k=0,a=0,b=0;
        for(int i=1;i<=n;i++){
            a=i;
            b=n-i;
            if(isNoZero(a) && isNoZero(b)){
                return new int[]{a,b};
            }
        }
        return new int[]{};
    }
     private boolean isNoZero(int num) {

        while (num > 0) {

            if (num % 10 == 0) {
                return false;
            }

            num /= 10;
        }

        return true;
    }
}