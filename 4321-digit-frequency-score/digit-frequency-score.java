class Solution {
    public int digitFrequencyScore(int n) {
        String str=String.valueOf(n);
        char ch[]=str.toCharArray();
        int fre[]=new int[10];

        //Arrays.sort(ch);
        int cal=0;
        for(int i=0;i<ch.length;i++){
            fre[ch[i]-'0']++;
        }
        
        for(int i=0;i<fre.length;i++){
            cal+=i*fre[i];
        }
        return cal;
    }
}