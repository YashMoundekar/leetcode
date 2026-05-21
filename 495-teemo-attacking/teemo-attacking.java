class Solution {
    public int findPoisonedDuration(int[] arr, int duration) {

        int total=0;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<=arr[i]+duration-1){
                total+=arr[i+1]-arr[i];
            }else{
                total+=duration;
            }
        }total+=duration;
        return total;
        
    }
}