class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {

        int num1=coordinate1.charAt(0)-'a';
        int num2=coordinate1.charAt(1)-'1';


        int num3=coordinate2.charAt(0)-'a';
        int num4=coordinate2.charAt(1)-'1';

        int str1=num1+num2;
        int str2=num3+num4;

        return str1%2==str2%2;
    }
}