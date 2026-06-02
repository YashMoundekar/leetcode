class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
         int sum = 0;

        for (int start = 0; start < arr.length; start++) {
            for (int len = 1; start + len <= arr.length; len += 2) {
                for (int i = start; i < start + len; i++) {
                    sum += arr[i];
                }
            }
        }

        return sum;


    }
}