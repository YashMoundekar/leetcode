class Solution {
    public String findValidPair(String s) {
        int arr[]=new int[101];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'0']++;
        }
        for(int i=0;i<s.length()-1;i++){
            int first = s.charAt(i) - '0';
            int second = s.charAt(i + 1) - '0';

            if (first != second &&
                arr[first] == first &&
                arr[second] == second) {

                return "" + first + second;
            }
        }
        return "";
    }
}