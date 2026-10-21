class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length;
        // if(nums[0]!=0)
        //     return 0;
        // for(int i=1;i<n;i++){
        //     if(nums[i]-nums[i-1]>1){
        //         return nums[i-1]+1;
        //     }
        // }
        // return n;
        int n=nums.length;
        int arr[]=new int[n+1];
        Arrays.fill(arr,-1);
        for(int i=0;i<n;i++){
            arr[nums[i]]=nums[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                return i;
            }

        }
        return 0;
    }
}