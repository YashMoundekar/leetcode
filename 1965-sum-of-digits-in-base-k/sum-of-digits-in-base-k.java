class Solution {
    int sum=0;
    public int sumBase(int n, int k) {
        while(n>0){
            sum+=n%k;
            n/=k;
        }
        return sum;
    }
}