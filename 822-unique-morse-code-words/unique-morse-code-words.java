class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String str[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> set=new HashSet<>();
        for(String i:words){
            StringBuilder s=new StringBuilder();
            for(char ch:i.toCharArray()){
                s.append(str[ch-'a']);
            }
            set.add(s.toString());
        }
        return set.size();
    }
}