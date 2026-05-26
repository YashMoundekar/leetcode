class Solution {
    public String greatestLetter(String s) {


        for (char c = 'Z'; c >= 'A'; c--) {

            boolean small=false;
            boolean capital=false;
            for (int i = 0; i < s.length() ; i++) {

                if (s.charAt(i) == (c + 32)) {
                   small=true;
                } 
                if (s.charAt(i)  == c) {
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