class Solution {
    public int getLeastFrequentDigit(int n) {
        
        int fre[]=new int[10];
        int temp=n;
        while(temp!=0){
            int rem=temp%10;
            fre[rem]++;
            temp/=10;
        }

        int min=Integer.MAX_VALUE;
        int sol=-1;
        for(int i=0;i<fre.length;i++){
            if(fre[i]>0 && fre[i]<min){
                min=fre[i];
                sol=i;
            }
        }
        return sol;
    }
}