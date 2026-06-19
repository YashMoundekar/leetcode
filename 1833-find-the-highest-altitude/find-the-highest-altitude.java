class Solution {
    public int largestAltitude(int[] gain) {
        /*int arr[]=new int[gain.length+1];
        int max=Integer.MIN_VALUE;
        arr[0]=0;
        for(int i=1;i<=gain.length;i++){
            arr[i]=arr[i-1]+gain[i-1];
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;*/

        int curr=0;
        int max=0;

        for(int i=0;i<gain.length;i++){
            curr+=gain[i];
            max=Math.max(curr,max);
        }
        return max;
    }
}