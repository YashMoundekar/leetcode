class Solution {
    public int maximumLengthSubstring(String s) {
        int ch[]=new int[26];
        int left=0,right=0;
        int max=0;
        while(right<s.length()){
            ch[s.charAt(right)-'a']++;

            while(ch[s.charAt(right)-'a']>2){
                ch[s.charAt(left)-'a']--;
                left++;
            }
            right++;
            max=Math.max(max,right-left);
        }
        return max;
    }
}