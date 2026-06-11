class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int size=n*n;
        int arr[]=new int[size+1];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[grid[i][j]]++;
            }
        }
        int repeat=0;
        int miss=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                repeat=i;
            }
            if(arr[i]==0){
                miss=i;
            }
        }
        return new int[]{repeat,miss};
    }
}