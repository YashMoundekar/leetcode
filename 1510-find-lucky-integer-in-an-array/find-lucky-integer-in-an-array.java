class Solution {
    public int findLucky(int[] arr) {

       int lucky[]=new int[501];
       for(int i=0;i<arr.length;i++){
        lucky[arr[i]]++;
       }
       int max=0;
        for(int i=0;i<lucky.length;i++){
            if(i==lucky[i]){
                if(lucky[i]>max){
                    max=lucky[i];
                }
            }
        }
        if(max==0){
            return -1;
        }else{
            return max;
        }
    }
}