class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;
        int arr[] = new int[26];

        for (char ch : allowed.toCharArray()) {
            arr[ch - 'a']++;
        }

        for (int i = 0; i < words.length; i++) {
            for (char ch : words[i].toCharArray()) {
                if (arr[ch - 'a'] <= 0) {
                    count--;
                    break;

                }
            }
        }
        return count;

    }
}