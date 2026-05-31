class Solution {
    public String longestPalindrome(String str) {
        String ans = "";

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {

                String sub = str.substring(i, j);

                if (isPalindrome(sub)) {

                    if (sub.length() > ans.length()) {
                        ans = sub;
                    }
                }
            }
        }

        return ans;
        
    }
    boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}