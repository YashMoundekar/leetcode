class Solution {
    public boolean digitCount(String num) {
        int fre[]=new int[11];
        for(int i=0;i<num.length();i++){
            int n=num.charAt(i)-'0';
            fre[n]++;
        }

        for(int i=0;i<num.length();i++){
            if(fre[i]!=num.charAt(i)-'0'){
                return false;
            }
        }
        return true;
    }
}