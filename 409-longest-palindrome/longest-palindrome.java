class Solution {

    public int longestPalindrome(String s) {

        int odd=0;

        Map<Character,Integer>mp=new HashMap<>();

        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            if(mp.get(ch)%2==1){
                odd++;
            }else{
                odd--;
            }
        }
        if(odd>1){
            return s.length()-odd+1;
        }
        return s.length();
    }
}