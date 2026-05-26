class Solution {
    public String greatestLetter(String s) {

        
        char ch[] = s.toCharArray();

        for (char c = 'Z'; c >= 'A'; c--) {

            boolean small=false;
            boolean capital=false;
            for (int i = 0; i < ch.length ; i++) {

                if (ch[i] == (c + 32)) {
                   small=true;
                } 
                if (ch[i]  == c) {
                    capital=true;
                } 

            }

            if(small && capital){
                return ""+c;
            }
        }
        return "";
    }
}