class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        String left[]=s1.split(" ");
        String right[]=s2.split(" ");

        HashMap<String,Integer> hp=new HashMap<>();


        for (String word : left) {
            hp.put(word, hp.getOrDefault(word, 0) + 1);
        }

        for (String word : right) {
            hp.put(word, hp.getOrDefault(word, 0) + 1);
        }

        ArrayList<String> ar=new ArrayList<>();

        for(String key:hp.keySet()){
            if(hp.get(key)==1){
                ar.add(key);
            }
        }
        return ar.toArray(new String[0]);
    }
}