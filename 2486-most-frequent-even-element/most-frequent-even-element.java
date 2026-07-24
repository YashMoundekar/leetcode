class Solution {
    public int mostFrequentEven(int[] nums) {

        int arr[] = new int[100001];

        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }

        int small = -1;
        int maxFreq = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0 && arr[i] > 0) {

                if (arr[i] > maxFreq) {
                    maxFreq = arr[i];
                    small = i;
                }
            }
        }

        return small;
    }
}