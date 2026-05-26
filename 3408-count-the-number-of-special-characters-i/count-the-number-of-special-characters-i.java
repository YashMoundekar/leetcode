class Solution {
    public int numberOfSpecialChars(String word) {
        char ch[] = word.toCharArray();
        int count = 0;

        for (char i = 'a'; i <= 'z'; i++) {

            boolean small = false;
            boolean capital = false;
            for (int j = 0; j < ch.length; j++) {

                if (ch[j] == i) {
                    small = true;
                }
                if (ch[j] == (char) (i - 32)) {
                    capital = true;
                }

            }
            if (small && capital) {
                count++;
            }
        }
        return count;
    }
}