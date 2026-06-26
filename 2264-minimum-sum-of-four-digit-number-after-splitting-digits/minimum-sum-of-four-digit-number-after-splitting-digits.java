class Solution {
    public int minimumSum(int num) {
        int count=0;
        int temp=num;
        while(temp!=0){
            int rem=temp%10;
            count++;
            temp/=10;
        }
        temp=num;

        int arr[]=new int[count];
        int k=0;

        while(temp!=0){
            int rem=temp%10;
            arr[k++]=rem;
            temp/=10;
        }
        Arrays.sort(arr);
        int n1=0;
        int n2=0;
        for (int i = 0; i < arr.length; i += 2) {
            n1 = n1 * 10 + arr[i];
        }

        for (int i = 1; i < arr.length; i += 2) {
            n2 = n2 * 10 + arr[i];
        }

        return n1+n2;
        
        
    }
}