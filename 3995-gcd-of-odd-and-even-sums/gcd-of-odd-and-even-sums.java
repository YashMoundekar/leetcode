class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = n*n;
        int evenSum = n*(n+1);

        // int odd = 1;
        // int even = 2;

        // for (int i = 1; i <= n; i++) {

        //     oddSum += odd;
        //     evenSum += even;

        //     odd += 2;
        //     even += 2;
        // }

        int a = oddSum;
        int b = evenSum;

        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a > 0 ? a : b;
    }
}