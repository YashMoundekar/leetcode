class Solution {
    public boolean validDigit(int n, int x) {
        boolean flag=false;

        while(n>=10){
            if(n%10==x){
                flag=true;
            }
            n/=10;
        }
        return flag && n!=x;
    }
}