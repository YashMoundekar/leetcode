class Solution {
    public boolean squareIsWhite(String coordinates) {
        int num=coordinates.charAt(0)-'a'+1;
        int num2=coordinates.charAt(1)-'0';

        return (num+num2)%2!=0;
        
    }
}