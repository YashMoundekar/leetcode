class Solution {
    public int numberOfSpecialChars(String word) {
        /*int count=0;
        for(char c='a';c<='z';c++){
            boolean small=false;
            boolean capital=false;
        
            for(int i=0;i<word.length();i++){
        
                if(word.charAt(i)==c){
                    small=true;
                }
                if(word.charAt(i)==Character.toUpperCase(c)){
                    capital=true;
                }
            }
            if(small && capital){
                count++;
            }
        }
        return count;*/
        int count = 0;
        for (char c = 'a'; c <= 'z'; c++) {

            int small = word.lastIndexOf(c);

            int capital = word.indexOf(Character.toUpperCase(c));

            if (small !=-1 && 
                capital !=-1 &&
                small < capital) {
                count++;
            }
        }
        return count;
    }
}