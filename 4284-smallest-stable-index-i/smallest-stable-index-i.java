class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int[] prefixMax = new int[n];
        int[] suffixMin = new int[n];

        prefixMax[0] = nums[0];
        int i = 1;
        while (i < n) {
            prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
            i++;
        }

        suffixMin[n - 1] = nums[n - 1];
        i = n - 2;
        while (i >= 0) {
            suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
            i--;
        }
        i = 0;
        while (i < n) {
            if (prefixMax[i] - suffixMin[i] <= k) {
                return i;
            }
            i++;
        }

        return -1;
        
    }
}

