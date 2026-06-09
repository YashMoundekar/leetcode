class Solution {
    public int alternateDigitSum(int n) {
        int temp=n;
        int count=0;
        while(temp!=0){
            count++;
            temp/=10;
        }
        temp=n;
        int sum=0;
        while(temp>0){
            int rem=temp%10;
            if(count%2!=0){
                sum+=rem;
                count--;
            }else{
                sum-=rem;
                count--;
            }
            temp/=10;
        }
        return sum;
    }
}