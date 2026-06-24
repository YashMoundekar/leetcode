class Solution {
    public int maxProduct(int n) {

        int arr[]=new int[10];  
        int i=0;
        while(n!=0){
            int rem=n%10;
            arr[i++]=rem;
            n/=10;
        }
        int max=Integer.MIN_VALUE;
        for(int j=0;j<i;j++){
            for(int k=j+1;k<i;k++){
                int sum=arr[j]*arr[k];
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
}