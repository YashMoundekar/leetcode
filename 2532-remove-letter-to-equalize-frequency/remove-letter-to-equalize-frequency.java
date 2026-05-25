class Solution {
    public boolean equalFrequency(String word) {

        HashMap<Character,Integer> hp=new HashMap<>();

        for(char ch:word.toCharArray()){
            hp.put(ch,hp.getOrDefault(ch,0)+1);
        }
        int count=0;
        for(char key:hp.keySet()){
             hp.put(key, hp.get(key) - 1);

            HashSet<Integer> set = new HashSet<>();

            for (int freq : hp.values()) {
                if (freq > 0) {
                    set.add(freq);
                }
            }

            if (set.size() == 1) {
                return true;
            }
            hp.put(key, hp.get(key) + 1);
        }
        return false;
    }
}