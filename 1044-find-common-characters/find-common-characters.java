class Solution {
    public List<String> commonChars(String[] words) {

        List<String> list = new ArrayList<>();
        String word = words[0];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            boolean flag = true;
            for (int j = 1; j < words.length; j++) {
                int index = words[j].indexOf(ch);
                if (index == -1) {
                    flag = false;
                    break;
                }
                words[j] = words[j].substring(0, index)
                        + words[j].substring(index + 1);
            }
            if (flag) {
                list.add(String.valueOf(ch));
            }
        }
        return list;
    }
}