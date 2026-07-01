class Solution {
    public int[] shortestToChar(String s, char c) {

        int n = s.length();
        int[] arr = new int[n];

        int count = n;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                count = 0;
            } else {
                if (count != n)
                    count++;
            }
            arr[i] = count;
        }

        count = n;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                count = 0;
            } else {
                if (count != n)
                    count++;
            }
            arr[i] = Math.min(arr[i], count);
        }

        return arr;
    }
}