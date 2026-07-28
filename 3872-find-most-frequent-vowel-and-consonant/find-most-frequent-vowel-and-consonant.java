class Solution {
    public int maxFreqSum(String s) {
        int cons[]=new int[26];
        int fre[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' ||ch=='u'){
            fre[s.charAt(i)-'a']++;
            }else{
                cons[s.charAt(i)-'a']++;
            }
        }
        int max=-1,max2=-1;
        for(int i=0;i<fre.length;i++){
            if(fre[i]>max){
                max=fre[i];
            }
            if(cons[i]>max2){
                max2=cons[i];
            }
        }
        return max+max2;
    }
}