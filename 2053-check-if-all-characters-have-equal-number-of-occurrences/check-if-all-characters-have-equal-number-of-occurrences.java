class Solution {
    public boolean areOccurrencesEqual(String s) {
        char ch[]=s.toCharArray();
        int res[]=new int[26];
        for(int i=0;i<ch.length;i++){
            res[ch[i]-'a']++;
        }

        int freq = 0;
        for(int i=0;i<res.length;i++){
            if(res[i]!=0){

            if (freq == 0) {
                    freq = res[i];   
            } else if (res[i] != freq) {
                    return false;
                }
        }
        }
        return true;
    }
}