class Solution {
    public boolean equalFrequency(String word) {

        HashMap<Character,Integer> hp=new HashMap<>();

        for(char ch:word.toCharArray()){
            hp.put(ch,hp.getOrDefault(ch,0)+1);
        }
        int count=0;
        for(char key:hp.keySet()){
            hp.put(key, hp.get(key) - 1);

            int freq = 0;
            boolean same = true;

            for (int val : hp.values()) {

                if (val == 0) {
                    continue;
                }

                if (freq == 0) {
                    freq = val;
                } else if (freq != val) {
                    same = false;
                    break;
                }
            }

            hp.put(key, hp.get(key) + 1);

            if (same) {
                return true;
            }
        }
        return false;
    }
}